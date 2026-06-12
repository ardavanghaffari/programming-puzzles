def baseline(array):
    return sorted([number**2 for number in array])


def split_and_merge(array):
    first_non_negative = 0
    while first_non_negative < len(array) and array[first_non_negative] < 0:
        first_non_negative += 1

    negative_pointer = first_non_negative - 1
    non_negative_pointer = first_non_negative
    result = []

    while negative_pointer >= 0 and non_negative_pointer < len(array):
        negative_square = array[negative_pointer] ** 2
        non_negative_square = array[non_negative_pointer] ** 2

        if negative_square <= non_negative_square:
            result.append(negative_square)
            negative_pointer -= 1
        else:
            result.append(non_negative_square)
            non_negative_pointer += 1

    while negative_pointer >= 0:
        result.append(array[negative_pointer] ** 2)
        negative_pointer -= 1

    while non_negative_pointer < len(array):
        result.append(array[non_negative_pointer] ** 2)
        non_negative_pointer += 1

    return result


def two_pointers(array):
    result = [0] * len(array)
    left_pointer = 0
    right_pointer = len(array) - 1

    for index in reversed(range(len(array))):
        left_square = array[left_pointer] ** 2
        right_square = array[right_pointer] ** 2

        if left_square > right_square:
            result[index] = left_square
            left_pointer += 1
        else:
            result[index] = right_square
            right_pointer -= 1

    return result
