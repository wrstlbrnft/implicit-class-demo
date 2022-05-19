## Dealing With Optionality

What happens if one does `get` on a field that was not set?
- Specified `default` value, if available
- Type-specific default: empty string, zero, first enum element, default instance for message (language dependent)

This leads to code looking like [PoorCats.scala](src/main/scala/com/leonteq/demo/cats/PoorCats.scala)
which is verbose & messy.

## How to Improve?
- Change the serialisation format
- Amend/improve the existing API
    - options?

#
#
[next](7-Implicit_Classes.md)