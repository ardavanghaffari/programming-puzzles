def search_in_sorted_matrix(matrix, target):
    row = 0
    column = len(matrix[0]) - 1

    while row < len(matrix) and column >= 0:
        value = matrix[row][column]
        if target == value:
            return [row, column]
        if target < value:
            column -= 1
        else:
            row += 1

    return [-1, -1]
