def brute_force(numbers, target_sum):
    for i, a in enumerate(numbers):
        for b in numbers[i + 1 :]:
            if a + b == target_sum:
                return [min(a, b), max(a, b)]
    return []


def hash_table(numbers, target_sum):
    summand = {}
    for a in numbers:
        b = target_sum - a
        if b in summand:
            return [min(a, b), max(a, b)]
        summand[a] = True
    return []


def two_pointer(numbers, target_sum):
    left_pointer = 0
    right_pointer = len(numbers) - 1

    numbers.sort()

    while left_pointer < right_pointer:
        left = numbers[left_pointer]
        right = numbers[right_pointer]
        if left + right == target_sum:
            return [left, right]
        if left + right > target_sum:
            right_pointer -= 1
        else:
            left_pointer += 1
    return []
