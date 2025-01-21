In Java, a function (or method) can only return a single value.

However, you can achieve the effect of returning multiple values using these workarounds:

- Return an Array or List: If the values you want to return are of the same type, you can create an array or a list to hold them and return that container.

- Create a Class: If the values you want to return are of different types, you can create a class to hold them as instance variables. The function can then create an object of this class and return it.

- Use Output Parameters: You can pass variables as arguments to the function and have the function modify these variables directly.

This is an example of how achieve this effect using a class.