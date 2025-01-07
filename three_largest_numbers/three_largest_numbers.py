import math


def three_largest_numbers(numbers):
    result = [-math.inf, -math.inf, -math.inf]

    for n in numbers:
        if n > result[0]:
            result[0] = n
            for i in range(2):
                if result[i] > result[i + 1]:
                    result[i], result[i + 1] = result[i + 1], result[i]

    return result
