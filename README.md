A compiler for the toy language `Lang` which compiles to Java Bytecode

To compile a file first build the compiler

```
$ javac Compiler.java
$ javac StdLib.java
```

Then create a `.lang` file (or use one of the examples)

For example

```
class HelloWorld {
	main {
		print "Hello world"
	}
}
```

Name this file `HelloWorld.lang`

Compile and run it using

```
$ java Compiler HelloWorld.lang
Generated class: HelloWorld
$ java HelloWorld
Hello World
```

A .class and .j file will be generated. If you don't want the .j file (the symbolic bytecode file which you can inspect) to be generated use

```
$ java Compiler HelloWorld.lang -j
```

You can look at more complex features showcased in `RandomGame.lang` and `CustomObject.lang`

Since this language compiles to Java Bytecode you can access any java methods, either from class files in the current directory, or standard library functions. By default `java.lang`, `java.util`, and `java.io` are imported, but you can import any others by using `import java.net`.
