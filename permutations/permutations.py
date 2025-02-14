def recursive(numbers):
    if len(numbers) == 0:
        return numbers

    if len(numbers) == 1:
        return [numbers]

    result = []
    for permutation in recursive(numbers[1:]):
        for updated_permutation in update_permutation_with_number(
            permutation, numbers[0]
        ):
            result.append(updated_permutation)

    return result


# A permutation like [1, 2] when updated with 3 will become [[3, 1, 2], [1, 3, 2], [1, 2, 3]]
def update_permutation_with_number(permutation, number):
    result = []
    for i in range(0, len(permutation) + 1):
        copy = permutation.copy()
        copy.insert(i, number)
        result.append(copy)
    return result


def backtracking(numbers):
    if not numbers:
        return []

    def swap(i, j):
        numbers[i], numbers[j] = numbers[j], numbers[i]

    def backtrack(first=0):
        # We've generated a permutation, add it to the result
        if first == len(numbers):
            result.append(numbers[:])
            return

        for i in range(first, len(numbers)):
            swap(first, i) # Fix the first element
            backtrack(first + 1) # Recurse on the subarray
            swap(first, i) # Backtrack

    result = []
    backtrack()
    return result
