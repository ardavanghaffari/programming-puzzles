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

    if not stack:
        return True
    else:
        return False
