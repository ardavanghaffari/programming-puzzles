def is_balanced(brackets):
    stack = []
    opening_brackets = ["(", "[", "{"]
    match = {")": "(", "]": "[", "}": "{"}

    for b in brackets:
        if b in opening_brackets:
            stack.append(b)
        if b in match:
            if not stack or stack.pop() != match[b]:
                return False

    if stack:
        return False

    return True
