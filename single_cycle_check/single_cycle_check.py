def has_single_cycle(array):
    num_elements_visited = 0
    current_idx = 0

    while num_elements_visited < len(array):
        if num_elements_visited > 0 and current_idx == 0:
            return False

        num_elements_visited += 1
        current_idx = get_next_idx(current_idx, array)

    return current_idx == 0


def get_next_idx(current_idx, array):
    return (current_idx + array[current_idx]) % len(array)
