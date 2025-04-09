def valid_ip_addresses(string, remaining_parts=4):
    result = []

    if remaining_parts == 1:
        if is_part_valid(string):
            result.append(string)
        return result

    for fixed_part_length in [1, 2, 3]:
        if not long_enough_given(fixed_part_length, remaining_parts, string):
            continue
        if not is_part_valid(string[:fixed_part_length]):
            continue
        ips = valid_ip_addresses(string[fixed_part_length:], remaining_parts - 1)
        if not ips:
            continue
        for ip in prepend(string[:fixed_part_length] + ".", ips):
            result.append(ip)

    return result


def long_enough_given(fixed_part_length, remaining_parts, string):
    return remaining_parts - 1 <= len(string) - fixed_part_length <= (remaining_parts - 1) * 3


def is_part_valid(string):
    withing_range = 0 <= int(string) <= 255
    no_leading_zero = string.startswith("0") is False if len(string) > 1 else True
    return withing_range and no_leading_zero


def prepend(prefix, arr):
    return [prefix + e for e in arr]
