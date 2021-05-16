Here are some of the key points about the java.util.Optional class which is worth remembering for future use:

  1) The Optional class is a container object which may or may not contains a non-null value.  That's why it is named Optional.

  2) If a non-value is available then Optional.isPresent() method will return true and get() method of Optional class will return that value.

  3) The Optional class also provides methods to deal with the absence of value e.g. you can call Optional.orElse() to return a default value if a value is not present.

  4) The java.util.Optional class is a value-based class and use of identity sensitive operations e.g. using the == operator, calling identityHashCode() and synchronization           should be avoided on an Optional object.

  5) You can also use the orElseThrow() method to throw an exception if a value is not present.

  6) There are multiple ways to create Optional in Java 8. You can create Optional using the static factory method Optional.of(non-null-value) which takes a non-null value and         wrap it with Optional. It will throw NPE if the value is null. Similarly, the Optional.isEmpty() method return an empty instance of Optional class in Java.

Optional Map and FlatMap example in Java 8


  7) The biggest benefit of using Optional is that it improves the readability and convey information which fields are optional, for example, if you have a Computer object you       can put CD drive as optional because now a day modern laptops like HP Envy doesn't have a CD or Optical drive.

Earlier it wasn't possible to convey client which fields are optional and which are always available, but now, if a getter method return Optional than client knows that value may or may not be present.

  8) Similar to java.util.stream.Stream class, Optional also provides filter(), map(), and flatMap() method to write safe code in Java 8 functional style. The method behaves similarly as they do in Stream class, so if you have used them before, you can use them in the same way with the Optional class as well.

  9) You can use the map() method to transform the value contained in the Optional object and flatMap() for both transformations and flattening which would be required when you are doing the transformation in a chain as shown in our Optional + flatMap example above.

  10) You can also use the filter() method to weed out any unwanted value from the Optional object and only action if Optional contains something which interests you.


That's all about how to use Optional in Java 8 to avoid NullPointerException. It's not full proof and you can argue that instead of a null check you are now checking if optional contains a value or not but main advantage of using Java 8 Optional is that it explicitly indicate that value can be null. This, in turn, results in more aware code than just assuming it can't be null. Optional also allows you to set intelligent default values.
