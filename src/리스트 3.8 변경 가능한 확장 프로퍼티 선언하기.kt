var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        setCharAt(length - 1, value)
    }