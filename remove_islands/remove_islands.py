def remove_islands(matrix):
    row = len(matrix) - 1
    col = len(matrix[0]) - 1

    non_islands = set()

    for r in [0, row]:
        for c in range(col + 1):
            if not is_zero((r, c), matrix):
                non_islands.add((r, c))
                find_more_non_islands_starting_from((r, c), non_islands, matrix, row, col)

    for c in [0, col]:
        for r in range(row + 1):
            if not is_zero((r, c), matrix):
                non_islands.add((r, c))
                find_more_non_islands_starting_from((r, c), non_islands, matrix, row, col)

    for r in range(row + 1):
        for c in range(col + 1):
            if (r, c) not in non_islands:
                matrix[r][c] = 0
    return matrix


def find_more_non_islands_starting_from(point, non_islands, matrix, row, col):
    for p in neighbors(point, row, col):
        if p not in non_islands and not is_zero(p, matrix):
            non_islands.add(p)
            find_more_non_islands_starting_from(p, non_islands, matrix, row, col)


def is_zero(point, matrix):
    return matrix[point[0]][point[1]] == 0


def neighbors(point, row, col):
    result = []

    if 0 <= point[0] + 1 <= row:
        result.append((point[0] + 1, point[1]))
    if 0 <= point[0] - 1 <= row:
        result.append((point[0] - 1, point[1]))
    if 0 <= point[1] + 1 <= col:
        result.append((point[0], point[1] + 1))
    if 0 <= point[1] - 1 <= col:
        result.append((point[0], point[1] - 1))

    return result
