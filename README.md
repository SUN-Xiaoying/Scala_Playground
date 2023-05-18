# Why Scala is cool?
No `static`, No `null`, No "back doors" (logs, exceptions)

# Checklist

## Scala vs. Java

| Scala          | Java     |
|----------------|----------|
| `object`       | `static` |
| `$colon$colon` | `List`   |

## Inventory
| Functions              | Example                |
|------------------------|------------------------|
| `nums.sortWith(_ < _)` | List(1, 3, 5, 7, 11)   |
| `nums.sortWith(_ > _)` | List(11, 7, 5, 3, 1)   |
| `for/yield`            ||

# What are we talking about, when it comes to FP

- Immutable values
- Pure functions
- Functions are values
- Functional error handling

# How to be a cool FP?

- No `class` with var => `case class`
    - `case class`, whose constructor parameters are `val` by default! 