def two_pointer(numbers, target_sum):
    numbers.sort()
    result = []

    for i in range(len(numbers) - 2):
        lp = i + 1
        rp = len(numbers) - 1

        while lp < rp:
            current_sum = numbers[i] + numbers[lp] + numbers[rp]

            if target_sum == current_sum:
                result.append([numbers[i], numbers[lp], numbers[rp]])
                lp += 1
                rp -= 1
            elif current_sum < target_sum:
                lp += 1
            else:
                rp -= 1

    return result
