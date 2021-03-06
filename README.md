# grade2_java2
 
## 아직 해결하지 못한 문제
Q. Integer 클래스가 immutable인 이유는 무엇인가?    

## 목차
[2 기본 자료형과 참조형](https://github.com/jeon9825/grade2_java2#02-기본-자료형과-참조형)    
[3 기본 자료형 클래스](https://github.com/jeon9825/grade2_java2#03-기본-자료형-클래스)      
[5 문자열 클래스](https://github.com/jeon9825/grade2_java2#05-문자열-클래스)     
[6 Java 배열 정렬 기능](https://github.com/jeon9825/grade2_java2#06-java-배열-정렬-기능)    
[7 Arrays 클래스](https://github.com/jeon9825/grade2_java2#07-arrays-클래스)
[Iterator](https://elren.blog.me/221084341094)
___


## 02 기본 자료형과 참조형

### 02-1 Java 소스 파일 규칙
1) Java 소스파일과 패키지 규칙
    1. 소스코드 파일 하나에 public 클래스는 한 개만 있어야 한다.    
    2. public 아닌 클래스는 소스 코드 파일에 여러개 있어도 된다.    
    3. public 클래스 이름과 소스 코드 파일명이 *대소문자*까지 정확하게 일치해야 한다.   
    4. 클래스가 속한 패키지 이름과 소스 코드 파일이 위치한 폴더 이름이 *대소문자*까지 정확하게 일치해야한다.  

## 02-2 String 클래스 & Object 클래스
1) String 클래스    
* char charAt(int index)    
    this 문자열에서 index 위치의 문자를 char로 리턴한다.    

* int compareTo(String s)   
    문자열을 알파벳 순서로 비교한다. this 문자열의 순서가 빠르면 음수를, s 문자열의 순서가 빠르면 양수를, 두 문자열이 같으면 0을 리턴한다.  

* int compareToIgnoreCase(String s)     
    *대소문자를 구별하지 않고* 문자열을 비교한다. 리턴값은 compareTo 메소드와 같다.     
* boolean contains(CharSequence s)      
    파라미터 문자열 s가 this 문자열의 일부와 일치하면 true를 리턴. 즉, 문자열 s가 this 문자열에 들어있으면 true를 리턴한다.     
* boolean endWith(String s)     
    this 문자열의 끝이 문자열 s와 일치하면 true를 리턴한다.   

* boolean equals(Object s) ★★★      
    this 문자열이 문자열 s와 일치하면 true를 리턴한다.      

* boolean equalsIgnoreCase(Object s)    
    대소문자를 구별하지않고 this문자열과 문자열 s가 일치하면 true를 리턴한다.    

* static String format(String format, Object... args)   
    첫번째 파라미터는 format string이다.    
    예) `System.out.println(String.format("%10d",a1);`   

* int indexOf(String s)     
    this 문자열에서 문자열 s를 찾아서 그 위치(index)를 리턴한다.    
    this 문자열에 문자열 s가 들어있지않다면 -1를 리턴한다.  

* boolean isEmpty()     
    this문자열의 길이가 0이면 true를 리턴한다.  

* int lastIndexOf(String s)     
    indexOf(String s) 메소드와 비슷하다.    
    문자열 s가 여러번 들어 있다면 마지막 위치를 리턴한다.   

* int length()  
    문자열의 길이를 리턴한다.   

* boolean matches(String regex)     
    파라미터로 주어진 regex 정규식(reqular express)과 this 문자열이 일치하면 true를 리턴한다.   
    ~~~java
    String s1= "hello";
	System.out.println(s1.matches("..l..")); // true 출력
    ~~~     

* String replace(CharSequence s1, CharSequence s2)     
    this 문자열에서 문자열 s1을 전부 찾아서 s2로 치환한다. 그렇게 치환된 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.   

* String replaceAll(String regex, String s2)    
    this 문자열에서 regex 정규식과 일치하는 부분을 전부 찾아서 s2로 치환한다. 그렇게 치환된 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.    
~~~java
String s1 = "hello";
String s2 = s1.replace("ell", "ELL");
String s3 = s1.replaceAll(".l.", "안녕");
System.out.println(s2+"\n"+s3); // hELLo\nh안녕o 출력 
~~~     

* String[] split(String regex)  
    regex 정규식과 일치하는 부분을 기준으로 this 문자열을 쪼갠다. 그렇게 쪼개진 문자열 배열을 리턴한다.
    예)     
    ```java
    String a = "c:/data/student/lecture.docx";
    String []  path = a.split("/");
    System.out.println(Arrays.toString(path));
    //출력 [c:, data, student, lecture.docx]
    ```

* boolean startsWith(String s)      
    this 문자열의 시작 부분이 문자열 s와 일치하면 true를 리턴한다.    

* String substring(int beginIndex)  
    this 문자열에서 beginIndex 위치에서 끝까지의 문자열을 리턴한다. this 문자열은 수정되지 않는다.         

* String substring(int beginIndex, int endIndex)    
    this 문자열에서 beginIndex 위치에서 endIndex 직전까지의 문자열을 리턴한다. this 문자열은 수정되지 않는다.   

* String trim()     
    this 문자열의 시작 부분과 끝 부분의 공백을 제거한 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.    

* String toLowerCase()  
    this 문자열에서 모든 대문자를 소문자로 변경한 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.  

* String toUpperCase()      
    this 문자열에서 모든 소문자를 대문자로 변경한 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.

* static String valueOf(int i)  
    i 값을 문자열로 반환하여 리턴한다.  

* static String valueOf(double d)    
    d 값을 문자열로 반환하여 리턴한다.  

2) call by value    

**파라미터로 전달될 때, 변수의 값만 복사되어서 전달될 뿐이고 변수 자체가 전달되는 것은 아니다.**    

3) immutable object (값을 수정할 수 없는 객체)     

String 객체는 생성된 두 문자열 값이 수정될 수 없다.     
String 클래스의 문자열 수정 메소드는, this의 문자열을 수정하는 것이 아니고, *수정된 새 문자열 객체*를 리턴한다.     

4) value object     

5) Object 클래스    

* protected Object clone()  
    자기 자신을 복제해서 *새 객체를 만들어* 리턴한다.     

* boolean equals(Object obj)    
    equals 메소드를 제대로 구현했다면, equals 메소드는 this 객체와 파라미터 obj 객체의 내용이 동일한지 비교해야 한다. (equality 비교) 그런데 Object 클래스에 구현된 equals 메소드는 제대로 구현되어 있지 않다. Object 클래스에 구현된 equals 메소드는 객체의 내용을 비교하지 않고 두 객체가 동일한 객체이진 비교한다. (identity 비교)   
    그래서 **equality를 제대로 비교하려면 자식 클래스에서 이 메소드를 재정의 해야 한다.**   

* protected void finalize()     
    객체가 더 이상 사용되지 않을 때, 자동으로 객체가 파괴되고 메모리가 회수된다. 이때 객체가 파괴되기 직전에 finalize() 메소드가 호출된다.      

* Class<?> getClass()   
    객체가 속한 클래스에 대한 정보를 담고 있는 객체를 리턴한다.     

* int hashCode()    
    객체를 hashtable 테이블 자료구조에 넣을 때 필요한 해쉬 값(hash code value)를 리턴한다.  

* String toString()     
    객체의 내용을 표현하는 문자열을 리턴한다. 리턴되는 문자열에 객체의 내용이 잘 표현되도록, 자식 클래스에서 이 메소드를 재정의 해야 한다.  

~~~java
String[] s = { "one", "two", "three" };
System.out.println(s.toString());
System.out.println(s);
System.out.println(Arrays.toString(s));
/* 출력값
[Ljava.lang.String;@74a14482
[Ljava.lang.String;@74a14482
[one, two, three]
*/
~~~
### 02-3 값 타입과 참조 타입
1) 값 타입(value type)  
2) 참조 타입(reference type)    
변수에 값이 아니라 참조가 대입되는 자료형   
변수가 차지하는 메모리 공간에 들어있는 것은 값이 아니고 참조이다.   
java 클래스의 객체는 모두 참조타입이다.     

3) [equals 메소드](https://github.com/jeon9825/grade2_java2#02-5-equals-메소드-재정의)    

### 02-4 객체 구조    
**Stack Segment**   
**Heap Segment**    

### 02-5 equals 메소드 재정의
1) instanceof 연산자 ★★★        
~~~java
Object s = "hello";
System.out.println(s instanceof String); // true 출력
~~~
~~~java
Object s = "hello";
System.out.println(s instanceof Object); // true 출력
~~~     

2) @Override 어노테이션의 장점      
(1) 부모 클래스의 메소드를 자식 클래스에서 재정의 하려면, 메소드 이름, 파라미터 수와 타입, 리턴 타입이 부모 클래스의 메소드와 정확히 일치해야 한다. 예를 들어 equals 메소드의 파라미터 타입은 Object 이어야 하고, 리턴 타입은 boolean 이어야 한다. @Override 어노테이션을 붙여주면, 위 사항들이 정확히 일치하는지 자동으로 검사된다.    
(2) @Override 어노테이션을 보면, 부모 클래스이 메소드를 재정의한다는 것을 바로 알 수 있어서 소크 코드 읽을 때 편하다.   

3) equals 메소드 재정의     
1.      
    ~~~java
    @Override
    public boolean equals(Object obj) { 
        if ((obj instanceof Person) == false) 
            return false; 
        Person p = (Person)obj; 
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age; 
    }
    ~~~
2.      
    ~~~java
    @Override 
    public boolean equals(Object obj) { 
        if (obj instanceof Person == false) 
            return false; 
        Person p = (Person)obj; 
        return Objects.equals(this.name, p.name) && this.age == p.age; 
    }
    ~~~

4) toString 메소드 재정의   
~~~java
@Override
public String toString() { 
    return String.format("Person{name=\"%s\", age=%d}", name, age); 
}
~~~     

### 02-6 String.format 메소드
1) String.format 메소드 사용법
이 메소드의 첫째 파라미터는 format string 이다.     

`% [argument index] [flag] [width] [.precision] type`    

[argument index] : 출력할 argument의 index를 지정한다. 이 값이 주어지지 않으면, format string 뒤에 오는 argument들 순서대로 출력된다.   

[flag] : 출력할 값이 숫자일 경우에, flag 가 + 이면 숫자 앞에 언제나 +- 부호를 붙인다. flag 가 0 이면, 숫자 앞에 0을 채워서 출력한다. 출력할 값이 문자열인 경우에, flag 가 - 이면 왼쪽 정렬로 출력되고, flag 가 없으면 오른쪽 정렬로 출력된다.   

[width] : 출력할 최소 폭을 지정한다.    

[.precession] : 숫자일 경우에 소숫점 아래 자릿수를 지정한다. 문자열일 경우에, 출력할 최대 문자수를 지정한다.    

type : 출력할 값의 타입을 지정한다. d 정수, s 문자열, f 실수, x 16진수.     

___
___

## 03 기본 자료형 클래스
### 03-1 객체배열

* Object 클래스     
    java의 모든 클래스의 부모 클래스    
* 부모 클래스의 메소드를 자식 클래스에서 재정의하기 위한 규칙   
    - 메소드 이름이 정확히 일치해야 한다.   
    - 파라미터 변수의 수와 타입이 일치해야 한다. (정확히 일치할 필요는 없다.)   
    - 리턴 타입이 일치해야 한다. (정확히 일치할 필요는 없다.)  
* @Override 어노테이션을 붙여주면, 실수를 막을 수 있다. 오타 등의 실수 때문에, 재정의 규칙이 깨지면, 컴파일 에러가 발생하기 때문에, 실수를 막을 수 있다.    

1) up-casting & down-casting    
~~~java
class Child extends Parent

Parent p;
Child c;

p = new Parent("부모1");
c = new Child("자식1", 15);
p = new Child("자식2", 16); // up-casting
c = new Parent(); // 컴파일 에러 down-casting
c = p; //컴파일 에러!!!!!! down-casting!!!!
~~~
**자식 객체 타입의 참조 값을 부모 객체 타입의 참조 변수에 대입하는 것은 문제가 없다(up-casting)**   
**Java 컴파일러가 컴파일할 때, 참조변수의 타입만 비교할 뿐, 그 참조변수가 가리키는 것이 실제로 어떤 객체인지는 무시**   

2) 배열 클래스   
**java 언어에서 배열도 어떤 클래스의 객체이다.**    

3) Object[]     
기본 자료형은 객체가 아니다.    
기본 자료형 int는 클래스가 아니기 때문에 int는 Object의 자식클래스가 아니다.    
123과 같은 정수를 Object 배열에 넣으려면, 먼저 123 정수를 객체로 변환해야한다.  

### 03-2 기본 자료형 클래스   
1) 기본 자료형 클래스     
**byte, short, int long, float, double, boolean, char**     
기본 자료형을 객체로 변환하기 위해서, 기본 자료형 각각에 대한 클래스가 Java 표준 라이브러리에 포함되어 있다.    


**Wrapper Class**   
* byte - Byte   
* short - Short     
* int - Integer     
* long - Long   
* float - Float     
* double - Double       
* boolean - Boolean         
* char - Character  

**기본 자료형 클래스에는 equals 메소드가 재정의되어있음.**    
~~~java
Integer x = new Integer(3);
Integer y = new Integer(3);
System.out.println(x.equals(y)); // true 출력!!!!
~~~

2) Auto-boxing & Auto-unboxing  
* Auto-boxing   

    `Object a1 = 3;`     
    `Object a2 = new Integer(3);`       
    둘은 같은 코드   
    컴파일러가 윗 코드를 아래코드로 자동으로 생성 Autoboxing    

* Auto-unboxing
    ~~~java
    Integer i1 = new Integer(3);
    int i2 = i1;    
    ~~~
    `int i2 = i1.intValue();`   

3) nullable integer     
    null 값이 가능한 int값을 java 변수에 대입하려면 기본 자료형이 int 변수를 사용할 수 없고 Integer 객체 참조 변수를 사용해야한다.  

### 03-3 static member
1) static member variable & static method   

2) static 메소드의 제약         
    static method <-> instance method       
    **static 메소드는 this 키워드를 사용할 수 없고 instance 메소드는 this 키워드를 사용할 수 있다.**    
    tatic 메소드는 this가 아닌 다른 객체 인스턴스의 멤버 변수나 메소드는 사용할 수 있다.   

3) static constructor (생성자)  
    main 메소드보다 먼저 호출된다.
```java
    public class Person { 
        static int staticVariable; 
        static { 
            staticVariable = 0;
        }
    }
```

~~~java
public class Person { 
    static int staticVariable = 0; 
}
~~~
___
___

## 05 문자열 클래스
### 05-1 Java 문자열
1) java 문자열의 종류   
![CharSequence](https://t1.daumcdn.net/cfile/tistory/993258405BB8ED7C2C)   

**CharSequence interface**  
String, StringBuilder, StringBuffer의 부모 인터페이스   
공통 부모 인터페이스를 구현(implements)한 클래스들은, 인터페이스에 선언된 메소드를 전부 구현해야 한다. 호환되는 클래스를 만들기 위해서 인터페이스를 활용한다.   

**String 클래스**   
String 객체는 생성된 뒤 문자열 값이 수정될 수 없다.     
String 클래스의 문자열 수정 메소드는, this 문자열을 수정하는 것이 아니고, 수정된 새 문자열 객체를 리턴한다. this 문자열은 수정되지 않는다. (immutable class)     

**StringBuilder**   
수정 가능한 문자열 객체는 StringBuilder 클래스이다.     
StringBuilder 클래스의 문자열 수정 메소드는 내부 문자열을 직접 수정한다.    

**StringBuffer**    
StringBuffer 클래스는 StringBuilder 클래스와 *기능이 같고 메소드도 같고 사용법도 같다.*   
차이점은 StringBuffer는 thread safe 하지만 StringBuilder는 thread safe 하지 않다는 점이다.      
thread safe 하다는 말은 멀티 스레드(multi-thread)로 실행되어도 안전하다는 말이다.   
그렇기 때문에, StringBuilder 보다 느리다.   
따라서 thread safe 해야 할 때에만 StringBuffer를 사용해야 한다.     

2) CharSequence 인터페이스 메소드
~~~~java
package java.lang;      
public interface CharSequence {
    char charAt(int index); 
    int length(); 
    CharSequence subSequence(int beginIndex, int endIndex); 
    String toString();          
}   
~~~~    
*interface의 메소드는 기본적으로 public abstract 메소드이다.*   
* char charAt(int index)        
    this 문자열에서 index 위치의 문자를 char로 리턴     
* int length()      
    문자열의 길이를 리턴    
* CharSequence subSequence(int beginIndex, int endIndex)    
    this 문자열에서 beginIndex 위치(inclusive)에서 endIndex직전까지(exclusive)의 문자열을 리턴한다.     
* String toString()
    내부 문자열을 String 클래스 객체로 리턴한다.

**인터페이스를 implements한 클래스는 인터페이스의 메소드를 재정의(override)해야한다.**  
**인터페이스를 implements한 클래스가 abstract 클래스가 아니라면, 인터페이스의 메소드를 전부 재정의해야한다.     그렇지 않더라면 *컴파일 에러*가 발생한다.**     


3) StringBuilder 클래스 메소드      

**StringBuilder가 리턴타입일 경우, 리턴 값은 this 객체이다.**       

**append(s) 함수**      
* StringBuilder append(CharSequence s)      
    문자열 s를 this 문자열 뒤에 추가한다. 이 메소드의 리턴 값은 this 객체이다.

* StringBuilder append(int i)   
    i 값을 문자열로 변환하여 this 문자열 뒤에 추가한다. 이 메소드의 리턴 값은 this 객체이다.    

* StringBuilder append(Double d)        
    d 값을 문자열로 변환하여 this 문자열 뒤에 추가한다. 이 메소드의 리턴 값은 this 객체이다.        

* char charAt(int index)        
    this 문자열에서 index 위치의 문자(char)를 리턴한다.   

* StringBuilder delete(int beginIndex, int endIndex)   
    this 문자열에서 beginIndex 위치에서 endIndex 직전까지의 문자열을 삭제한다. 이 메소드의 리턴 값은 this 객체이다.  

* StringBuilder deleteCharAt(int index)   
    this 문자열에서 index 위치의 문자를 삭제한다. 이 메소드의 리턴 값은 this 객체이다.      

* int indexOf(String s)      
    this 문자열에서 문자열 s를 찾아서 그 위치(index)를 리턴한다. this 문자열에 문자열 s가 들어있지 않다면 -1을 리턴한다.    

* StringBuilder insert(int index, CharSequence s)       
    this 문자열의 index 위치에 문자열 s를 끼워 넣는다. 이 메소드의 리턴 값은 this 객체이다.     

* StringBuilder insert(int index, Object obj)   
    obj 객체를 문자열로 변환하여 this 문자열의 index 위치에 끼워 넣는다. 이 메소드의 리턴 값은 this 객체이다.   

* int lastIndexOf(String s)         
    this 문자열에서 문자열 s를 찾아서 그 위치(index)를 리턴한다. 문자열 s가 여러 번 들어있다면 마지막 위치를 리턴한다. this 문자열에 문자열 s가 들어있지 않다면 -1을 리턴한다.      

* int length()  
    문자열의 길이를 리턴한다.   

* StringBuilder replace(int beginIndex, int endIndex, String s)     
    this 문자열에서 beginIndex 위치에서 endIndex 직전까지의 문자열을 문자열 s로 치환한다. 이 메소드의 리턴 값은 this 객체이다.      

* StringBuilder reverse()   
    문자열을 거꾸로 뒤집는다. 이 메소드의 리턴 값은 this 객체이다.      

* void setCharAt(int index, char c)     
    this 문자열에서 index 위치의 문자를 c로 변경한다.   

* CharSequence subSequence(int start, int end)          
    this 문자열에서 beginIndex 위치에서 endIndex 직전까지의 문자열을 리턴한다. this 문자열은 수정되지 않는다.   
    **subString과의 차이점은 subSequence메소드는 CharSequence 인터페이스에 선언되어 있고 리턴 타입이 CharSequence이다.**    

* String substring(int beginIndex)  
    this 문자열에서 beginIndex 위치에서 끝까지의 문자열을 리턴한다. this 문자열은 수정되지 않는다.  

* String substring(int beginIndex, int endIndex)    
    this 문자열에서 beginIndex 위치에서 endIndex 직전까지의 문자열을 리턴한다. this 문자열은 수정되지 않는다.   

* String toString()         
    this 문자열을 String 객체로 변환하여 리턴한다.      
    **StringBuilder를 이용한 어떤 메소드를 만들 때 리턴값이 String일 경우 toString을 이용하여 반환한다.**

4) equals 메소드

* String 클래스는 equals 메소드를 재정의(override)하였기 때문에 문자열 값이 일치하면 true를 리턴한다.       
* StringBuilder 클래스는 Object의 equals 메소드를 상속받았기 때문에 문자열이 동일해도 false가 리턴된다.         

~~~java
StringBuilder sb1 = new StringBuilder();
sb1.append("안녕");
StringBuilder sb2 = new StringBuilder();
sb2.append("안녕");
System.out.println(sb1.equals(sb2)); // 출력값 false
~~~     
에러는 발생하지 않는다. (Object 클래스를 상속하고 있기 때문에)  
문자열을 조립해서 생성할 때만 잠깐 StringBuilder 객체를 사용하라는 의미에서 equals 메소드가 재정의되지 않았다.  

### 05-2 예제코드   
~~~~java
StringBuilder builder = new StringBuilder();    
for (String s : list) {
    if (builder.length() > 0) 
        builder.append(", "); 
    builder.append('"'); 
    builder.append(s); 
    builder.append('"'); 
    // builder.append('"').append(s).append('"'); 와 같은 코드
    // 메소드 호출을 연속해서 구현하는 코딩 기법 (method chaining)
    // 리턴 타입이 StringBuilder인 이유가 method chaining 코딩 기법을 활용하기 위함.
}   
System.out.println(builder.toString());
~~~~    
___
___

## 06 Java 배열 정렬 기능   
### 06-2 Comparable 인터페이스     
1) Comparable 인터페이스    

    **Comparable 인터페이스를 구현한 클래스 객체의 배열은 Arrays 클래스의 sort 메소드를 사용하여 정렬할 수 있다.**      

`public static void sort(Comparable[] a);`  

**Comparable 인터페이스**   
~~~~java
interface Comparable<T> {
    int compareTo(T obj)
}
~~~~
[Comparable 인터페이스를 구현한 클래스](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html)    
String 클래스, Integer 클래스도 Comparable 인터페이스를 구현했기 때문에, Arrays.sort 메소드로 정렬할 수 있다.   

2) 기본 자료형 배열과 객체 배열     

java언어에서 배열도 일종의 객체!    
객체는 heap segment 영역에 설정된다.    
    
~~~~java
Integer[] b1 = new Integer[] { new Integer(10), new Integer(11), new Integer(12) }; 
Integer[] b2 = new Integer[] { 10, 11, 12 }; 
Integer[] b3 = { 10, 11, 12 };
~~~~    
서로 완전히 동일한 배열     

**Comparable 인터페이스를 구현하면, Arrays.sort 메소드를 사용하여 객체 배열을 정렬할 수 있다.**

~~~~java
public class Person implements Comparable<Person> {
    @Override
    public int compareTo(Person p) {
        int r = this.name.compareTo(p.name); // 먼저 이름(name)을 비교한다. 
        if (r != 0) return r; // 이름이 같지 않다면, 이름 비교 결과를 리턴한다. 
        return this.age - p.age; // 이름이 같다면, 나이(age) 비교 결과를 리턴한다. 
    } 
}
~~~~    


예시)
~~~~java
public class PersonNameComparator implements Comparator<Person> { 
    @Override 
    public int compare(Person p1, Person p2) { 
        int r = p1.name.compareTo(p2.name); // 먼저 이름(name)을 비교한다. 
        if (r != 0) return r; // 이름이 같지 않다면, 이름 비교 결과를 리턴한다. 
        return p1.age - p2.age; // 이름이 같다면, 나이(age) 비교 결과를 리턴한다. } }
~~~~    

### 06-3 Comparator 인터페이스
~~~~java
interface Comparator<T> {
    int compare(T obj1, T obj2);
}
~~~~    
![내림차순정렬](https://t1.daumcdn.net/cfile/tistory/991812365BB8EBB121)        
내림차순 정렬   
객체를 정렬하는 경우엔 Comparator 클래스의 compare 메소드를 수정하면 내림차순 정렬이 가능하다. 윗 코드 참조.    

___
___

## 07 Arrays 클래스
### 07-2 유틸러티 클래스 헬퍼클래스

1) 자식클래스  

어떤 클래스에 메소드를 추가로 구현하려고 할 때,  
만약 그 클래스를 수정할 수 없다면, 자식클래스를 만들어서 메소드를 추가로 구현하면 된다.  
  
아래의 코드는 String 클래스를 상속받은 MyString이라는 자식클래스를 만들었다.   
~~~~java
class MyString extends String {   
    public MyString(String s){   
        super(s);   
    }   
    public static boolean isNullOrEmpty(String s) {    
        return s == null || s.length() == 0;    
    }   
    public static boolean isNullOrBlank(String s) {    
        return s == null || s.trim().length() == 0;    
    }   
    public boolean isBlank() {   
        return this.trim().length() == 0;  
    }  
}  
~~~~

이렇게 만들 경우 단점은 String클래스에서 가능했던 문법을 사용하지 못할 수도 있다.  
예) `MyString s = "hello";  `  
  
2) 유틸러티 클래스  

~~~~java
 class StringUtils {   
     public static boolean isNullOrEmpty(String s) {   
         return s == null || s.length() == 0;  
    }  
    public static boolean isNullOrBlank(String s) {  
        return s == null || s.trim().length() == 0;  
    }  
    public static boolean isBlank(String s) {   
        retusn s.trim().length() == 0;  
    }  
}  
~~~~   
StringUtils 클래스의 모든 메소드는 static메소드!    
*StringUtils 클래스의 멤버 변수를 사용할 일이 없기 때문이다.*   
다음과 같이 사용한다.  
  
~~~~java
String s = "hello";  
if (StringUtils.isNullOrBlank(s) == false)   
    errorMessage = "내용을 입력하세요";  
~~~~

### 07-3 Arrays 클래스
1) Arrays 클래스(유틸러티 클래스)   

Arrays 클래스의 메소드는 static method   
Arrays 클래스의 메소드는 첫번째 parameter로 받은 *배열*에 대해서 어떤 작업을 하는 메소드(this 객체에 대해서 어떤 작업은 하지않는다.)   
   
2) Arrays 클래스 메소드

* static List<T> asList(T... a)   
    파라미터 값들로 List<T> 타입의 객체를 생성하여 리턴한다.
    예) `List<String> stringList = Arrays.asList("a","b","c");`
   
* static int binarySearch(T[] a, T key)   
    배열 a에서 key의 값을 찾아서 index를 리턴
    배열 a에 key값이 없을 경우 key값을 끼워 넣을 위치를 index라고 하면 (index * -1) -1 값을 리턴한다.   
    *sort() 메소드를 사용 후 사용*   
    정렬되지 않은 배열에서 binary search(이진탐색)을 하면 에러가 발생하지는 않지만 잘못된 값이 리턴된다.    
   
* static T[] copyOf(T[] a, int newLength)       
    newLength 길이의 배열을 생성하고, a 배열의 값들을 새 배열에 복사하고, 새 배열을 리턴한다.   
   
* static T[] copyOfRange(T[] a, int from, int to)       
    배열 a에서 from index 위치에서 to index 위치까지의 값들로 구성된 새 배열을 생성하여 리턴한다.   
   
* static boolean equals(T[] a1, T[] a2)     
    배열 a1의 원소 각각에 대해서 equals 메소드를 호출하여 배열 a2에서 같은 위치(index)의 원소와 equality를 비교한다.   
    예: `Arrays.equals(a1[i],a2[i])`   
    모든 원소의 equality가 같을 때 true를 리턴한다.   
   
* static boolean deepEquals(T[] a1, T[] a2)     
    Arrays.equals(T[] a1, T[] a2) 메소드와 거의 같은 일을 한다.   
    1차원 배열인 경우에는 equals 메소드를 사용하고, 다차원 배열인 경우에는 deepEquals 메소드를 사용해야 한다.   
   
* static void fill(T[] a, T value)  
    배열의 모든 원소에 value 값을 대입한다.   
    
* static void fill(T[] a, int from, int to, T value)    
    배열의 from index 에서 to index 까지 원소에 value 값을 대입한다.    

* static int hashCode(T[] a)    
    배열에 들어있는 객체들의 hashCode 값을 전부 고려하여 전체 hashCode 값을 계산하여 리턴한다.  
    Object 클래스에 int hashCode(); 메소드가 있다. 이 메소드는 this 객체의 hashCode 값을 계산하여 리턴한다. hash table에 객체를 저장할 때 이 hashCode 값이 사용된다.    

* static int deepHashCode(T[] a)        
    Arrays.hashCode(T[] a) 메소드와 거의 같은 일을 한다.    
    1차원 배열인 경우에는 hashCode 메소드를 사용하고, 다차원 배열인 경우에는 deepHashCode 메소드를 사용해야 한다.   

* static void sort(T[] a)       
    배열의 원소를 정렬한다. *배열의 원소의 타입 T는 기본 자료형이거나, Comparable interface를 implements한 클래스 타입이어야 한다.*     
    예를 들어 Java의 String 클래스나 Date 클래스는 Comparable interface를 implements 하였다.    
    값의 크기를 비교할 수 있는, Java 표준 라이브러리의 클래스들은 대부분 Comparable interface를 implements 하였다.  

* static void sort(T[] a, Comparator<T> comparator)     
    배열의 원소를 정렬한다. 정렬하기 위해서 배열의 원소를 비교할 때, comparator의 compare 메소드를 사용한다.    
    예)     
    ~~~~java
    Comparator<Person> personComparator = new PersonComparator(Compare.BY_AGE_DESC);
    (중략)
    Arrays.sort(a, personComparator);
    ~~~~    

* static String toString(T[] a)     
    배열의 내용을 문자열로 변환해서 리턴한다.   

* static String deepToString(Object[] a)    
    다차원 배열의 내용을 문자열로 변환해서 리턴한다.    

**랜덤 정수 생성 방법**     
예)     
~~~~java
Random random = new Random();
int i = random.nextInt(10);
~~~~    
Random 클래스의 int nextInt(int n) 메소드는 0~n-1 정수 중의 하나를 랜덤하게 골라서 리턴  

## 08 다형성 구현   
### 08-01 배경지식      

1) 객체 지향 설계    
1. 상속
메소드 재정의 (override) : 자식 클래스에서 기능을 수정, 공통 기능은 부모 클래스에 구현하여 재사용
2. 다형성   
자식 클래스들은 사용하는 용도가 비슷. 사용 방법이 호환되도록 만든 것이 다형성   

2) 다형성을 구현하는 방법
사용용도가 비슷한 클래스들은 

    1. 다형성을 구현하려는 클래스들이 공통 부모 클래스를 상속(extends) 받거나, 아니면 공통 Interface를 구현(implements) 해야 한다.  
    2. 공통 부모 클래스를 상속 받은 자식 클래스들은 다형성을 구현하려는 부모 클래스의 메소드들을 재정의(override) 해야 한다.    
    공통 메소드가 부모 클래스에 선언이 되어있어야함. 자식 클래스에서 부모 클래스에 있는 그 메소드를 재정의(override)해야 함.    
    3. 다형성 메소드를 호출할 때 객체 참조 변수는 **부모 타입**으로 호출해야 함.  공통 부모 클래스 타입의 변수나, 공통 interface 타입의 변수를 사용하여 메소드를 호출해야 다형성 호출이다. 자식 클래스 타입의 변수를 사용하여 메소드를 호출하면 언제나 그 자식 클래스를 호출하면 언제나 그 자식 클래스의 메소드가 호출될 것이기 때문에 다형성 호출이 아니다.  

3) 인터페이스와 클래스의 차이점     
* 클래스: 메소드 상속&다형성      
* 인터페이스: 다형성 구현만을 위해 있음. 상속은 하지못한다.     

4) interface    
* java 언어의 interface는 메소드 구현 없이 메소드 선언만 포함해야 한다. 그리고 멤버 변수도 없어야 한다.     
* 사용방법이 같고 서로 호환이 되는 클래스들을 여러 개 만들어야 할 때, interface를 활용한다.     
    1. 미리 그 사용 방법(public method 목록)을 interface로 정의한다.        
    2. 그 interface에 정의된 public method를 구현(implements)하는 형태로 클래스들을 구현한다.   

* public abstract 메소드    
    인터페이스는 모든 메소드가 자동적으로 public abstract 메소드    
    생략해더라도 인터페이스의 메소드는 모두 public abstract 메소드이다.

* public static 메소드
    인터페이스의 멤버 변수는 모두 public static final 멤버변수이다.     
    public static final 키워드를 멤버 변수 앞에 붙여주어도 되고 생략해도 된다.      
    생략하더라도 인터페이스의 멤버 변수는 모두 public static final 멤버 변수이다.   

5) 메소드 재정의       
부모 클래스 메소드를 자식 클래스에서 다시 구현하는 것을 메소드 재정의(override)라고 부른다.     
* 메소드명이 정확하게 일치해야한다.     
* 파라미터의 수가 정확하게 일치해야 한다.   
* 파라미터의 타입이 정확하게 일치해야 한다. 
* 리턴 타입이 일치해야 한다.    
* 자식 메소드의 리턴 타입이 부모 메소드의 리턴 타입의 자식 클래스이어도 된다.   
* 파라미터 변수 명은 일치하지 않아도 된다.  

6) @Override 어노테이션
재정의 메소드의 @Override 어노테이션을 붙이면, 부모 클래스의 메소드를 정확하게 재정의 했는지 컴파일러가 검사해준다.     

7) abstract method & abstract class     
abstract 클래스의 인스턴스 객체를 생성할 수 없다.   
오직 concrete 클래스의 인스턴스 객체만 생성할 수 있다.      
abstract 메소드, abstract 클래스 앞에 abstract 키워드를 붙여주지 않으면 컴파일 에러가 발생한다.     
abstract 클래스를 상속한 자식 클래스가 concrete 클래스라면, concrete 자식 클래스는 상속 받은 abstract 메소드를 전부 재정의 해야한다. 그렇지 않으면 컴파일 에러가 발생한다.      
abstract 클래스를 상속한 자식 클래스가 abstract 클래스라면, abstract 자식 클래스는 상속 받은 abstract 메소드를 전부 재정의 하지 않아도 되고 해도 된다.      

### 08-02 예제 코드

**다형성 호출 예제**    
~~~java
class Parent{
    public void method1(){
        ...
    }
}

class ChildOne extends Parent{
    @Override
    public void method1(){
        ...
    }
}
class ChildTwo extends Parent{
    @Override
    public void method1(){
        ...
    }
}
class ChildThree extends Parent{
}

public class Polymorphism1{
    public static void main(String[] args){
        Parent parent;
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        ChildThree obj3 = new ChildThree();

        obj1.method1(); // 다형성 호출이 아님.

        parent = obj1;
        parent.method1(); // 다형성 호출
    }
}

public class Polymorphism2{
    static void doSomething(Parent parent){
        parent.method1();
    }
    public static void main(String[] args){
        Parent parent;
        ChildOne obj1 = new ChildOne();
        ChildTwo obj2 = new ChildTwo();
        ChildThree obj3 = new ChildThree();

        obj1.method1(); // 다형성 호출이 아님.

        doSomething(obj1); // 다형성 호출
    }
}
~~~

**abstract 클래스 예제**    
~~~java
abstract class Parent{
    public static final double PI=3.141592;

    public abstract void method1();
    publuc abstract void method2();
}

class ChildOne extends Parent{
    @Override
    public void method1(){
        System.out.println("ChildOne method1()");
    }
    @Override
    public void method2(){
        System.out.println("ChildOne method2()");
    }
}
public class Abstract2{
    static void doSomething(Parent parent){ //다형성 호출
        parent.method1();
        parent.method2();
    }
    public static void main(String[] args){
        ChildOne obj1 = new ChildOne();
        doSomething(obj1);
    }
}
~~~


## 09 Collection
### 09-01 Collection Framework
1) Collection Framework 이란?

**Class library**   
자주 사용하는 클래스들을 컴파일해서 jar 파일로 묶어 놓은 것     
java 표준 클래스 라이브러리 : JDK에 포함된 클래스 라이브러리

**Framework**       
프레임웍 클래스 라이브러리(framework class library) : 클래스 라이브러리 중에서 규모가 좀 크고, 클래스들의 구조가 간단하지 않을 것들, 간단히 줄여서 프레임 웤(framework)라고 부른다.     
framework에서 중요한 점은, 클래스들이 서로 연결되고 실행되는 구조가 단순하지 않고 세련되었다는 점이다.      
즉, 객체지향적으로 세련된 구조를 갖는 클래스 라이브러리를 프레임웍이라고 부른다.    

**Collection Class**    
내부에 자료 목록을 보관하기 위한 클래스를 컬렉션 클래스라고 부른다. 
컬랙션 클래스에 보관할 수 있는 자료는 참조형이어야 한다.(기본 자료형은 컬랙션 클래스에 보관할 수 없다. 기본 자료형을 컬랙션에 보관할 때는, 자동으로 참조형으로 변환되어 보관된다.(auto-boxing))    

* Collection Framework   
Java 표준 라이브러리에 포함된 컬랙션 클래스들의 수가 많고, 그 구조가 간단하지 않기 때문이다.    

2) Collection Framework 구성요소    
1. interface    
    컬렉션 클래스들을 서로 호환되는 몇 개의 그룹으로 나눌 수 있다.  
    **implemetations**      
    컬렉션 클래스 그룹에 속하는 클래스들은 그 그룹 대표 java interface를 구현(implements)해야한다.      
    **Algorithms**      
    collection class들을 대상으로 정렬(sorting), 탐색(searching) 등의 연산을 구현한 메소드들을 collection framework의 algorithms 라고 부른다. 이 알고리즘 메소드들을 다형성(polymorphism)을 활용하여 구현되었다.    
3) Collection framework의 interface들
![collection framework의 interface들](https://t1.daumcdn.net/cfile/tistory/9999973F5BD1AAD21C)    

**Collection interface**    
대다수의 자바 컬렉션 클래스를 대표하는 interface이다. 대다수의 자바 컬렉션 클래스들에 Collection interface의 메소드들이 구현되어 있다.      

**Set interface**   
수학에서 집합(set)은 값이 같은 항목을 여러개 포함할 수 없다.    
>> HashSet, TreeSet     

**List interface**      
List interface를 구현한 대표적인 클래스가 ArrayList이다. 배열과 비슷한 방법으로 사용할 수 있는 컬렉션 클래스들을 대표하는 것이 List interface이다.     
>> ArrayList, LinkedList        

**Queue interface**     
Queue에 데이터를 넣고 꺼내는 방식은 FIFO(first in first out)이다.   

**Deque interface**     
양방향 큐, 양쪽에서 넣거나 꺼낼 수 있다. 그래서 큐처럼 FIFO방식으로 이용할 수도 있고, stack처럼 LIFO 방식으로 사용할 수도 있다.     

**Map interface**   
키(key)로 값(value)을 등록하거나 꺼내는 방식으로 사용하는 컬렉션 클래스들을 대표하는 인터페이스이다.    
>> HashMap, TreeMap     

**SortedSet interface, SortedMap interface**   
SortedSet, SortedMap은 각각 Set, Map의 자식 인터페이스이다. 그래서 각각 Set, Map에 정의된 메소드들을 상속받는다. SortedSet, SortedMap은 데이터를 정렬된 순서로 보관한다.    
데이터가 정렬된 순서이기 때문에 가능한 메소드들이 SortedSet, SortedMap 인터페이스에 포함되어 있다.      

### 09-02 Collection Interface
java.util.Collection 인터페이스     
자료 목록을 보관하는 용도의 클래스를 컬렉션 클래스라고 부른다.      
java 표준 라이브러리에 들어있는 대부분의 컬렉션 클래스들(Map은 제외)은 Collection interface를 implements하였다.     

1) Collection interface method      
* boolean add(E e)      
객체 e를 내부 목록에 추가한다. 추가 작업이 성공했으면 true를, 실패면 false를 리턴한다.    

* boolean addAll(Collection<E> c)   
목록 객체 c에 들어있는 항목들을 전부 내부 목록에 추가한다.  
추가 작업이 성공했으면 true, 실패면 false를 리턴한다.   

* void clear()      
내부 목록에 들어 있는 항목 전체를 제거한다. 그 결과 내부 목록은 비어 있는 상태가 된다.      

* boolean contains(Object o)
파라미터 o와 동일한 값이 내부 목록에 들어있다면 true를 리턴한다.    

* boolean containsAll(Collection<E> c)      
컬렉션 객체 c에 들어있는 항목들이 전부 this 객체의 내부 목록에 들어있는지 확인한다. 전부 들어있다면 true를 리턴한다.    
동일한 값이 있는지 찾을 때 equals 메소드를 호출해서 비교한다.   

* boolean equals(Object o)
객체 o와 this 객체의 equality를 비교한다.   
즉, this 객체와 o 객체의 클래스가 같고, 목록 o에 들어있는 항목의 수가 그것과 동일하고, 양쪽 목록에 들어있는 항목들 각각이 서로 동일한 경우에 true를 리턴한다.   
항목들이 각각이 서로 동일한지 비교할 때 equals 메소드를 호출해서 비교한다.  

* int hashCode()    
내부 객체 목록까지 고려하여 hash code 값을 계산해서 리턴한다.   

* boolean isEmpty()     
목록이 비어 있으면 true를 리턴한다.     

* Iterator<E> iterator()     
내부 목록에 들어있는 항목을 하나씩 탐색하기 위한 iterator 객체를 생성하여 리턴한다.     

* boolean remove(Object o)  
파라미터 o와 동일한 값(equals)을 목록에서 찾아서 제거한다. 파라미터 값이 null이면, null을 찾아서 제거한다.  
제거에 성공했으면 true를, 실패면 false를 리턴한다.      

* boolean removeAll(Collection c)   
파라미터로 주어진 목록 객체 c에 들어있는 항목들을 this 객체에서 찾아서 전부 제거한다.   
제거된 항목이 한 개 이상이면 true를 리턴한다.   

* boolean retainAll(Collection c)   
파라미터로 주어진 목록 객체 c에 들어있지 않은 항목들을 this 객체에서 찾아서 전부 제거한다.   
그래서 c에 들어있는 항목들만 this 객체에 남아있게 된다.     
제거된 항목이 한 개 이상이면 true를 리턴한다.   

* int size()    
내부 목록에 들어있는 항목의 수를 리턴한다.      

* Object[] toArray()
목록 객체에 들어있는 항목들을 배열에 채워서 리턴한다. 리턴되는 배열의 타입은 Objectp[]이다.     

* E[] toArray(E[] a)    
목록 객체에 들어있는 항목들을 배열에 채워서 리턴한다.   
리턴되는 배열의 타입은 파라미터로 주어진 배열의 타입과 같다.    

### 09-03 Collection 예제   
```java
Collection<String> c = new ArrayList<String>();```  
ArrayList 클래스는 Collection 인터페이스를 구현(implements) 하였다.     
따라서 Collection 인터페이스가 ArrayList 클래스의 부모 타입이다.

```java
c.add("one");
c.add("two");
c.add("three");
```
**부모 타입의 변수로 메소드를 호출**해야 다형성 호출이다.   

```java
for(String s : c)
    System.out.printf("%s",s);
```
배열뿐만아니라, Collection 인터페이스를 구현한 클래스 객체들도 위와 같은 for문으로 탐색할 수 있다.      

```java
Collection<String> c1 = new LinkedList<String>();
```
LinkedList 클래스도 Collection 인터페이스를 구현(implements) 하였다. 따라서 Collection 인터페이스가 LinkedList 클래스의 부모 타입이다. 자식 타입의 객체에 대한 참조를 부모 타입의 변수에 대입하는 것은 가능하다.    

```java
static void printCollection(Collection<String> c){
    //
    Object[] a = c.toArray();
    String s = Arrays.toString(a);
    // String s = c.toString();으로 하는게 더 간단함. (Collection 인터페이스에서 toString()이 재정의되어있음.) 
    System.out.println(s);
}
```

## 10 inner class와 lambda expression   
java 8  
1) lambda Expression    
2) stream API class 
=> 함수형 프로그래밍이 가능하도록함! 
-> 복잡한 데이터 처리. 병렬 처리를 구현할 때    
(빅데이터 분야, GUI에서 리스너를 구현할 때)     

### 10-01 inner class
1) inner class      
**inner class 객체를 생성할 때, outer class 객체에 대한 this가 inner class 객체에 자동으로 전달된다.**    
그래서 inner class의 메소드에서 outer class 객체에 대한 this를 사용할 수 있다.      
outter class 객체에 대한 this가 있는 곳에서만 (instance method), inner class 객체를 생성할 수 있다.

```java
public class OutterClass1{
    int a;
    class InnerClass{
        int b;
        void method2(){
            // inner class 메소드에서 this는 inner class를 가르킨다.
            b = 5;
            this.b = 6;
            
            // inner class method에서 outter class 객체에 대한 this를 사용할 수 있다.
            // 멤버 변수
            a = 7;
            OutterClass1.this.a = 8;
            // 멤버 메소드
            instanceMethod();
            OutterClass1.this.instanceMethod();
            // this.instanceMethod();          컴파일 에러 
            // inner class에 instranceMethod() 메소드가 없으므로 위 코드는 컴파일 에러가 발생한다.
            main(null);
        }
    }

    public void instanceMethod(){
        InnerClass obj = new InnerClass();
        a = 1;
        this.a = 2;
        obj.method2();
    }

    public static void main(String[] args){
        OutterClass o = new OutterClass();
        o.instanceMethod();
        // InnerClass o = new InnerClass(); 컵파일 에러
        // a = 3;                           컴파일 에러
        // this.a = 4;                      컴파일 에러
        // **메인 메소드는 static 메소드이기때문에 this를 사용할 수 없고 inner class를 생성할 수 없다.**
    }
}
```

**inner class의 객체생성을 할 수 있는 곳은 outter class의 instance method에서만 가능하다.**

### 10-02 static inner class    
1) static inner class   
outter class 객체에 대한 this가 없는 곳에서도 (**static method**) inner class 객체를 생성할 수 있다.        

### 10-03 anonymous inner class
1) 예제 #1      
~~~java 
class MyActionListener implements ActionListener{
    OutterClass3 window;

    public MyActionLister(OutterClass3 window){
        this.window=window;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(window,window.message);
    }
}
~~~

~~~java
ActionListener listener = new MyActionListener(this);
button.addActionLister(listener);
~~~

2) 예제 #2      
~~~java
public class OutterClass extends JFrame{
    ...
    ActionListener listener = new MyActionListener(this);
    button.addActionLister(listener);

    class MyActionListener implements ActionListener{
        @Overrride
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(OutterClass.this,message);
        }
    }
}
~~~

3) 예제 #3      
~~~java
public class OutterClass extends JFrame{
    ...
    ActionListener listener = new ActionListener(){ //anonymous inner class => 자식 클래스 이름을 생략한다. 
        @Overrride
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(OutterClass.this,message);
        }
    }
    /* 위 코드가 하는 일은 다음과 같다.
    1. ActionListener 인터페이스를 구현(implemnents)한 자식 클래스를 만들었다. 이 자식 클래스의 이름은 없다(anonymous class)
    2. 이 자식 클래스에서 actionPerformed 메소드를 재정의하였다.
    3. 이 자식 클래스의 객체가 하나 생성되고,
    4. 그 객체에 대한 참조가 listener 지역 변수에 대입된다.
    */
    button.addActionLister(listener);
}
~~~

4) 예제 #4      
~~~java
public class OutterClass extends JFrame{
    ...
    /* 위 코드가 하는 일은 다음과 같다.
    1. ActionListener 인터페이스를 구현(implemnents)한 자식 클래스를 만들었다. 이 자식 클래스의 이름은 없다(anonymous class)
    2. 이 자식 클래스에서 actionPerformed 메소드를 재정의하였다.
    3. 이 자식 클래스의 객체가 하나 생성되고,
    4. 그 객체를 파라미터로 전달하면서, button.addActionListener(생성된 객체); 메소드가 호출된다.
    */
    button.addActionLister(new ActionListener(){ //anonymous inner class => 자식 클래스 이름을 생략한다. 
        @Overrride  
        public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(OutterClass.this,message);  
        }
    }); 
    // button.addActionListener(객체);
}
~~~

5) 예제 #5 #6      
~~~java
public class OutterClass extends JFrame{
    ...
    button.addActionLister(e->{JOptionPane.showMessageDialog(OutterClass.this,message);}); 
    // button.addActionListener(객체);
    button.addActionLister(e->JOptionPane.showMessageDialog(OutterClass.this,message)); //lambda expression에서 메소드 본문이 간단한 메소드 호출 뿐이라면, 중괄호와 세미콜론을 생략할 수 있다.
}
~~~

## 11 Thread    
### 11-01 스레드(thread)
1) 스레드란?        
java 컴파일러는 java 소스 코드를 바이트코드(bytecode)로 컴파일한다.     
CPU가 바이트 코드를 하나씩 순서대로 실행하고 있는 것을, 그 실행 흐름을 스레드(thread)라고 부른다.       

2) 멀티 스레드(multi thread)        
요즘 CPU는 멀티 코어 형태이기 때문에, 각각의 코어가 독립적으로 바이트 코드를 실행할 수 있다. 즉, 여러개의 스레드가 동시에 실행될 수 있다.   

3) 실행 흐름 생성   
Thread 클래스의 start 메소드를 호출하면 새 실행 흐름이 생성된다. Thread 객체를 생성하는 것은 객체만 생성할 뿐이고, 새 실행 흐름이 생성되는 것은 아니다. start 메소드를 호출할 때 새 실행 흐름이 생성된다.   

### 11-02 스레드 생성   
**구현 방법 1**      
**Thread 클래스를 상속(extends)**하여 자식 클래스 ChildThread 클래스를 구현한다.         
ChildThread 클래스에서 **run 메소드를 재정의**한다.     
ChildThread 클래스의 객체를 생성한다.   
ChildThread 객체의 **start 메소드를 호출하면 새 실행 흐름이 생성되어 ChildThread 객체의 run 메소드를 실행**하게 된다.   
메인 스레드는 start 메소드 아래로 실행을 계속한다.      

**구현 방법 2**      
**Runnable 인터페이스를 구현(implements)**한 ChildRunnable 클래스를 구현한다.   
ChildRunnable 클래스에서 **run 메소드를 재정의**한다.   
ChildRunnable 클래스 객체를 생성한다.   
**ChildRunnable 객체를 파라미터로 Thread 객체를 생성**한다.     
**Thread 객체의 start 메소드를 호출**하면 새 실행 흐름이 생성되어 ChildRunnable 객체의 run 메소드를 실행하게 된다.  
메인 스레드는 start 메소드 아래로 실행을 계속한다.  

### 11-03 스레드 종료 시점
**Thread 클래스의 join 메소드**     
메인 스레드가 스레드 객체의 join 메소드를 호출하면, 그 스레드가 실행흐름이 run 메소드를 리턴하여 종료될 때까지 main 메소드는 대기하다가 리턴한다.   
~~~java
threadOne.start();
threadTwo.start();
threadThree.start();
try{
    threadOne.join();
    hreadOne.join();
    threadOne.join();
} catch(InterruptedException e){
    System.out.println("interrupted");
}
~~~

### 11-04 공유 변수

~~~java
class MyThread extends Thread{
    static int sum = 0;

    @Override
    public void run(){
        try{
            for(int i=1;i<=count;++i){
                synchronized(MyThread.class){ 
                    sum += i;
                }
                // 여러 스레드가 공유하는 변수(여기서는 static int sum;)를 읽고 쓸때는 락이 필요하다.
                // sum 변수가 MyThread 클래스의 클래스 변수이기 때문에 위 코드로 락을 걸면 된다. 락이 걸리면 다른 스레드는 그 부분을 실행할 수 없기 때문에 안정하다.
                // 클래스 멤버 변수는 인스턴스 객체에 들어있지 않고, 그 클래스 객체에 들어있다. 즉, MyThread.class 객체에 들어있다고 보면 된다.
                int mili_second = random.nextInt(10);
                sleep(mili_second);
            }
        }catch(InterruptedException e){
            System.out.println("interrupted");
        }
    }
}
~~~

### 11-05 공유 객체
~~~java
class SharedObj{
    int sum = 0;

    synchronized void add(int i){
        sum += i;
    }
}
~~~

## 12 List 인터페이스

### 12-01 List interface 메소드     
**Collection 인터페이스로부터 상속받은 메소드**     

* boolean add(E e)
* boolean addAll(Collection<E> c)
* void clear()
* boolean contains(Object o)
* boolean containsAll(Collection<E> c)
* boolean equals(Object o)
* int hashCode()
* boolean isEmpty()
* Iterator<E> iterator()
* boolean remove(Object o)
* boolean removeAll(Collection<E> c)
* boolean retainAll(Collection<E> c)
* int size()
* Object[] toArray()
* E[] toArray(E[] a)

**List interface에 선언된 메소드**      
* void add(int index, E e)
    객체 e를 내부 목록의 index 위치에 끼워 넣는다.      
* boolean addAll(int index, Collection<E> c)    
    목록 객체 c에 들어있는 항목들을 전부 내부 목록의 index 위치에 끼워 넣는다. 추가 작업이 성공했으면 true를, 실패면 false를 리턴한다.      
* E get(int index)      
    내부 목록에서 index 위치의 객체를 리턴한다.
* int indexOf(Object o)
    내부 목록에서 객체 o를 찾아서 위치를, 즉 index 값을 리턴한다. 찾지 못할 경우 -1을 리턴한다.     
* ListIterator<E> listIterator()    
    내부 목록에 들어있는 항목을 하나씩 탐색하기 위한 ListIterator 객체를 생성하여 리턴한다.     
* E remove(int index)   
    내부 목록에서 index 위치의 객체를 제거한다. 리턴 값은 제거된 객체이다.      
* void set(int index, E e)  
    내부 목록에서 index 위치에 객체 e를 대입한다. index 위치의 기존의 값을 덮어쓴다.    
* List<E> subList(int fromIndex, int toIndex)   
    내부 목록에서fromIndex부터 시작해서, toIndex 직전까지의 항목을 포함하는 새 List 객체를 생성하여 리턴한다.

**List 인터페이스를 구현한 클래스**  
1. ArrayList 클래스 : 배열 형태의 자료구조
2. LinkedList 클래스 : 링크드 리스트 형태의 자료구조
3. Vector 클래스 : 배열 형태의 자료구조 + synchronized object   

* synchronized object   
여러 스레드(thread)가 객체 하나를 공유하며 동시에 공유 객체의 메소드를 호출해도 문제가 발생하지 않도록 구현한 객체      
- 스레드가 객체의 메소드를 실행하기 직전에 객체를 잠근다. (lock)
- 스레드가 메소드에서 리턴하기 직전에 잠금을 해제한다. (unlock)

### 12-02 List 예제
```cpp
List<String> list = new ArrayList<String>();
list.add("one");
list.add("three");
list.add(0, "zero");
list.add(2, "two");
//zero one two three
```
```cpp
List<String> list1 = new ArrayList<String>();
List<String> list2 = new LinkedList<String>();

list1.add("one");
list1.add("two");
list2.add("zero");
list2.add("three");
list2.addAll(1,list1);
//list2는 zero one two three
```
```cpp
List<String> list = new ArrayList<String>();
list.add("one");
list.add("three");
list.add(0,"zero");
list.add(2,"two");

for(int i = 0 ; i < list.size() ; ++i)
    System.out.printf("%s ", list.get(i));
```
```cpp
List<String> list = new ArrayList<String>();
list.add("zero");
list.add("one");
System.out.println(list.indexOf("one")); 
//1
```
```cpp
List<String> list = new ArrayList<String>();

list.add("zero");
list.add("one");
list.add("two");
list.add("three");

list.remove("two");
//zero one three
```
```cpp
List<String> list = new ArrayList<String>();

list.add("zero");
list.add("one");
list.add("two");
list.add("three");

list.remove(2, "TWO");
//zero one TWO three
```
```cpp
List<String> list = new ArrayList<String>();

list.add("zero");
list.add("one");
list.add("two");
list.add("three");

List<String> list2 = list.subList(1, 3); //one two
```

### 12-03 다형성 활용
인터페이스를 만드는 이유: 다형성을 활용하기 위해서      
예)     
int getSum(ArrayList<Integer> list)     
int getSum(LinkedList<Integer> list) 이 두 메소드를 둘 다 구현하는 것은 낭비

int getSum(List<Integer> list) 이 메소드만 구현하자.

**파라미터 변수 타입을 부모 클래스나 부모 인터페이스 타입으로 선언하여 다형성을 활용하자**

## 13 Map
### 13-01 Map 인터페이스 
List의 특징 : index (0, 1, 2, 3 ...)        
Map의 특징 : KEY 값! key는 hashCode() 메소드를 재정의한 클래스이어야 한다.      
* data 클래스(예) Integer, Doble, Date, String ... 는 hashCode() 메소드가 재정의 되어있음.      

**Map interface**       
데이터 항목 한 개는 key와 value로 구성된다.         
데이터 항목을 등록할 때는, key와 value를 같이 등록한다.         
데이터 항목을 꺼낼 때는, key로 찾아서 value를 리턴한다.     

1) Map<K,V> interface   
Map 인터페이스를 사용할 때, Map<K,V> 형태로 사용한다.   
여기서 K, V 부분에 각각 실제 클래스 타입을 지정해야 한다.
K는 key의 타입이고, V는 value의 타입이다.       

**객체 생성의 예**      
```java
Map<String,Person> map = new HashMap<String,Person>();
```
key 타입은 String 객체이고, value는 Person 객체이다.        

**Map 인터페이스를 구현한 클래스**    
**HashMap 클래스**      
해시 테이블 알고리즘으로 구현된 클래스      
해시 테이블 알고리즘의 성능
평균 : O(1)
최악의 경우 : O(n)      

**TreeMap 클래스**          
Red Black Tree 알고리즘으로 구현된 클래스       
Red Black Tree 알고리즘의 성능
평균 : O(log n)
최악의 경우 : O(log n)      
**TreeMap 클래스는 SortMap 인터페이스를 구현하였다. 등록된 데이터 항목들이 key 순서대로 정렬된다. (Red Black Tree도 Binary Tree 이다.)**        

**Map<K,V> interface 메소드:star:**        
* void clear()      
    내부 목록에 들어있는 항목 전체를 제거한다. 그 결과 내부 목록은 비어 있는 상태가 된다.   
* boolean containsKey(Object k)     
    등록된 key 목록 중에서 k가 포함되어 있으면 true, 없으면 false를 리턴한다.       
* boolean containsValue(Object v)       
    등록된 value 목록 중에서 v가 포함되어 있으면 true, 없으면 false를 리턴한다.     
* Set<Map.Entry<K,V>> entrySet()    
    등록되 데이터 항목들의 목록을 Set 컬렉션 타입으로 리턴한다.     
    key의 타입은 K고, value의 타입은 V이고, 리턴되는 데이터 항목의 타입은 Set<Map.Entry<K,V>>타입이다.      
* V get(Object k)
    (key: k)로 등록했던 value를 리턴한다.       
* boolean isEmpty()
    등록된 데이터가 0개면 true를 리턴한다.      
* Set<V> keySet()   
    등록된 key 목록을 Set 타입으로 리턴한다.    
* V put(K k, V v)   
    (key : k, value : v) 등록한다.
    (key : k)로 이미 등록되어 있던 value가 있다면, v로 치환된다.        
    리턴 값은 (key: k)로 이미 등록되어 있던 value이다. 등록되어 있던 value가 없을 경우 null을 리턴한다.         
* void putAll(Map map)      
    map에 등록되어 있는 데이터 항목들을 전부 this에 등록한다.       
* V remove(K k)
    (key : k)로 등록되어 있던 데이터를 제거한다.    
    리턴 값은 (key: k)로 이미 등록되어 있던 value이다.      
    등록되어 있던 value가 없을 경우 null을 리턴한다.        
* int size()        
    등록된 데이터 항목의 수를 리턴한다.     
* Collection<V> values()    
    등록된 value 목록을 Collection 타입으로 리턴한다.       


예제)   
```java
Map<String, Integer> map = new HashMap<>();
map.put("a",101);
map.put("b",102);
map.put("c",103);
System.out.printf("%d %d %d", map.get("a"), map.get("b"),map.get("c"));
// 101 102 103 출력

map.remove(102);
System.out.printf("%d %d %d", map.get("a"), map.get("b"),map.get("c"));
// 101 null 103 출력

```

### 13-02 equals(), hashCode() 메소드 재정의
1) equals, hashCode 메소드를 재정의 해야 함.    
HashMap 클래스는 해시 테이블 알고리즘으로 구현되었다.   
해시 테이블 알고리즘에서 저장할 데이터의 hash 값을 계산할 때, hashCode 메소드를 사용한다.
HashMap key의 타입인 K는 equals, hashCode 메소드를 재정의 해야한다.     

2) Object 클래스의 equals, hashCode 메소드의 문제점     
hashCode 메소드와 equals 메소드는 Object 클래스에 정의되어 있기 때문에 모든 Java 클래스에 상속된다.             
equals 메소드는 객체의 내용이 동일한지 비교해야 하는데(equality 비교) Object 클래스에 구현된 equals 메소드는 identity를 비교한다.           
hashCode 메소드는 객체의 내용을 가지고 계산해야 하는데 Object 클래스에 구현된 hashCode 메소드는 identity를 가지고 계산한다.     
3) Object 클래스
**hashCode 메소드 재정의**      
```java
@Override
public int hashCode(){
    return Objects.hash(name,age,Arrays.hashCode(a));
}
// return Objects.hash(...);
// ... 부분에 모든 멤버 변수를 나열하면 된다.
```

**equals 메소드 재정의**        
```java
@Override
public boolean equals(Object obj){
    if (this==obj) return true;
    if (obj instanceof Person == false) return false;
    Person p = (Person) obj;
    return this.age==p.age && Objects.equals(this.name, p.name);
    // return 문에서 모든 멤버 변수를 비교 해야한다.
    // 기본 자료형은 this.age==p.age 형태로 비교
    // 참조형은 Objects.equals() 형태로 비교하면 된다.
}
```

#### 목록 출력 예제
```java
Map<String, Integer> map = new HashMap<>();
map.put("a", 101);
map.put("b", 102);
map.put("c", 103);

for(String key : map.keySet()) //탐색
    System.out.printf("(%s, %d)", key, map.get(key));

for(Map.Entry<String,Integer> entry : map.entrySet())
    System.out.printf("%s, %d", entry.getKey(), entry.getValue());
```

## 14 Regular Expression (정규식)
### 14-01 정규식
* [] 특수문자       
    괄호 안의 문자들 중에서 아무 것이나 한 문자와 일치하는지 비교한다.      
    예) `[tT]he` the The        
    예) `9[123]` 91 92 93       
    예) `[a-zA-Z]` 알파벳 한문자        
* . 특수문자    
    아무 문자 한 개와 일치한다.
    예) `A.B` AzB A@B
* [^ ] 특수문자
    괄호 안의 문자들을 제외한 다른 문자들 중에서 아무 것이나 일치하는지 비교한다.
    예) `[^tT]he` 일치하지 않는 문자열 : the The
* ? 특수문자
    ? 특수 문자 바로 앞의 정규식과 일치하는 문자 0~1개 있는지 비교한다. 
    예) `AB?C` AC ABC       
* \* 특수문자     
    \* 특수문자 바로 앞의 정규식과 일치하는 문자가 0~여러 개 있는지 비교한다.     
    예) `AB*C` AC ABC ABBC ABBBC ...        
* \+ 특수문자
    \+ 특수 문자 바로 앞의 정규식과 일치하는 문자 1~여러 개가 있는지 비교한다.      
    예) `AB+C` ABC ABBC ABBBC ...       
* ^ 특수문자    
    ^ 특수 문자는 줄바꿈 문자로 구분되는 각 줄의 선두 부분에서 있는 문자열인지 검사한다.        
    예) `^123`
* $ 특수문자    
    $ 특수 문자는 줄바꿈 문자로 구분되는 각 줄의 끝 부분에서 있는 문자열인지 검사한다.      
    예) `123$`      
* {n} 특수문자  
    { } 괄호 안에는 숫자가 1개 들어있어야 한다. { } 괄호 앞의 정규식과 일치하는 문자가 반복되는 수 == { }괄호 안의 숫자     
    예) `AB{3}C` ABBBC      
* {n,m} 특수문자
    { } 괄호 안에는 숫자가 2개 들어있어야 한다. n <= { } 괄호 바로 앞의 정규식과 일치하는 문자가 반복되는 수 <= m       
    예) `AB{2,3}C` ABBC ABBBC
* () 특수 문자
    ( ) 괄호 안의 정규식을 묶는 역할을 한다.    
    예) `A(BC){2,3}D` ABCBCD ABCBCBCD       
* | 특수문자    
    | 특수 문자 앞 뒤의 정규식 둘 중의 하나와 문자열이 일치해야 한다.       
    예) `Ab|cD`==`A[bc]D`       
* \ 특수문자        
    정규식 특수문자를 보통의 문자처럼 비교할 때, 특수문자앞에 \ 문자를 붙인다.      
    예) `Ab\?D` Ab?D        


### 14-02 String 클래스의 정규식 메소드 
1) String 클래스의 match 메소드
```java
boolean matches(String regex)
// this 문자열이 정규식 regex에 일치하는지 검사하여 true/false를 리턴
```
```java
String [] a = new String []{
    "010-323-1232", "02-545-3323", "010-9320-4124"
}
String regex "0(2|[1-9]{2})-[0-9]{3}-[0-9]{4}" ;
for(String s : a){
    if(s.matches(regex))
        System.out.prinf("\"%s\" matches \"%s\"\n",s,regex);
}
```

2) String 클래스의 replaceAll, replaceFirst 메소드      
`String replaceAll(String regex, String replacement)`       
this 문자열에서 정규식 regex와 일치하는 부분을 찾아서 전부 replacement로 치환한 새 문자열을 리턴. (새 문자열을 생성해서 리턴할 뿐 this 문자열은 변경되지 않는다.)       

`String replaceFirst(String regex, String replacement)`     
첫부분만 replacement로 치환     

3) String 클래스의 split 메소드     
`String[] split(String regex)`      
this 문자열에서 regex 정규식과 일치하는 부분을 기준으로 문자열을 잘라서 문자열 배열을 만들어 리턴s한다. (this 문자열은 변경되지않는다.)      
```java
String s = "one two, three,\t four: \t\nfive...six";
String [] a = s.split("[ ,.;\t\n]+");
System.out.println(Arrays.toString(a));
// 출력결과 [one, two, three, four, five, six]
```
### 14-03 Pattern, Matcher 클래스
정규식 찾기& 바꾸기를 수행하기 위한 클래스들이 Pattern, Matcher 클래스      

1) Pattern 객체 생성            
```java
Pattern p = Pattern.complie("정규식");
// 정규식을 찾기위한 Pattern 객체를 생성한다.
```

2) Matcher 객체 생성        
```java
Matcher m = p.matcher("비교할 문자열");
// 비교할 문자열에서 정규식과 일치하는 부분을 찾기 위한 Matcher 객체를 생성한다.
```

3) 찾기         
```java
m.find()
// 비교할 문자열에서 정규식과 일치하는 부분을 찾는다. 찾았으면 true, 못찾았으면 false를 리턴한다.
```

**String의 matches 메소드와 Matcher의 find 메소드의 차이점**    
String 클래스의 matches 메소드는 **입력 문자열 전체**가 정규식과 일치해야 true를 리턴한다.      
Matcher 클래스의 find 메소드는 일치하는 부분이 입력 문자열에 포함되어 있으면 true를 리턴한다.       
찾은 결과) `m.group(0)` 비교할 문자열에서 정규식과 일치하는 부분을 리턴한다.        

**정규식과 일치하는 부분 찾기**         
```java
String s = "032-131-1312 010-5534-6574 02-242-3352 010-444-2234";
String regex = "010-[0-9]{3,4}-[0-9]{4}";

Pattern p = Pattern.compile(regex);
Matcher m = p.matcher(s);

if(m.find())
    System.out.println(m.group(0));

//계속 찾기
while(m.find())
    System.out.println(m.group(0));
```
**정규식의 일부와 일치하는 문자열**
```java
String s = "032-131-1312 010-5534-6574 02-242-3352 010-444-2234";
String regex = "010-([0-9]{3,4})-(?<b>[0-9]{4})";

Pattern p = Pattern.compile(regex);
Matcher m = p.matcher(s);

if(m.find())
    System.out.println(m.group(0));

//계속 찾기
while(m.find())
    System.out.println(m.group(0));
    // Matcher의 group(0) 메소드는 정규식과 일치하는 부분 전체를 리턴한다.
    System.out.println(m.group(1));
    // Matcher의 group(1) 메소드는 정규식과 일치하는 부분 중에서 첫 번째 ( ) 괄호에 해당하는 부분을 리턴한다.
    System.out.println(m.group("b"));
    // (?<이름>정규식) group(String 이름) 메소드를 사용한다.
```

## 15 Iterator  
### 15-01 Iterator 인터페이스   
1) Iterator 인터페이스 메소드
* `boolean hasNext()` 
    컬렉션에 아직 탐색할 데이터가 남아 있으면 true를 리턴한다.  
    모든 데이터의 탐색을 완료하고 탐색이 끝났으면 false를 리턴한다.     
* `E next()` 
    다음 데이터 항목으로 현재 위치를 이동한 후, 그 데이터 항목을 리턴한다.      
    이미 현재 위치가 목록의 끝이라서, 다음 데이터 항목이 없다면 예외(NoSuchElementException)가 발생한다.   
* `void remove()`       
    컬렉션에서 현재 위치의 데이터를 제거한다.       
    직전의 next() 메소드 호출에서 리턴된 데이터가 제거된다.     

2) Iterator 객체 생성       
Collection 인터페이스를 구현(implements)한 클래스들은 모두 iterator 메소드를 구현했다.      
`Iterator iterator()`   
    현재 컬렉션 객체를 탐색하기 위한 이터레이터 객체가 생성되어 리턴된다.       
    리턴된 이터레이터 객체의 현재 위치는, *아직 아무것도 가르키고 있지 않다.*       
    이터레이터 객체를 생성한 후, **next() 메소드를 호출하면 목록에서 첫 데이터 항목을 가리킨다.**       

```java
Collection<Integer> c = new ArrayList<>();
for(int i = 0 ; i < 10 ; ++i)
    c.add(i);

Iterator<Integer> iterator = c.iterator();
while(iterator.hasNext()){
    int i = iterator.next();
    System.out.print(i+" ");
    //짝수 제거 ==> 제거할 때 for-each문을 사용하면 에러가 발생한다.
    if(i % 2 == 0) iterator.remove();
}
```

### 15-02 ListIterator 인터페이스
1) ListIterator 인터페이스 메소드
* `void add(E e)`
    현재 위치에 e를 끼워 넣는다.    
    직전의 next() 메소드 호출로 리턴된 데이터 바로 뒤거나,     
    직전의 previoud() 메소드 호출에서 리턴된 데이터의 바로 앞에 e가 삽입된다.       

* `boolean hasNext()`   
    순방향으로 컬렉션을 탐색 중일 때, 컬렉션에 아직 탐색할 데이터가 남아 있으면 true를 리턴한다.    
    즉, 현재 위치의 뒤에 데이터 항목이 있으면 true를 리턴하고 없으면 false를 리턴한다.      

* `boolean hasPrevious()`   
    역방향으로 컬렉션을 탐색 중일 때, 컬렉션에 아직 탐색할 데이터가 남아 있으면 true를 리턴한다.        

* `E next()`    
    다음 데이터 항목으로 현재 위치를 이동한 후, 그 데이터 항목을 리턴한다.      
    이미 현재 위치가 목록의 맨 끝이라서, 다음 데이터 항목이 없다면 예외(NoSuchElementException)가 발생한다.     

* `int nextIndex()`     
    다음 데이터 항목으로 현재 위치를 이동한 후, 그 데이터 항목의 **인덱스**를 리턴한다.         
    이미 현재 위치가 목록의 끝이라서, 다음 데이터 항목이 없다면 예외(NoSuchElementException)가 발생한다.     

* `E previous()`
    이전 데이터 항목으로 현재 위치를 이동한 후, 그 데이터 항목을 리턴한다.         
    이미 현재 위치가 목록의 끝이라서, 다음 데이터 항목이 없다면 예외(NoSuchElementException)가 발생한다.        

* `int previousIndex()`
    이전 데이터 항목으로 현재 위치를 이동한 후, 그 데이터 항목의 **인덱스**를 리턴한다.         
    이미 현재 위치가 목록의 끝이라서, 다음 데이터 항목이 없다면 예외(NoSuchElementException)가 발생한다.        

* `void remove()`   
    컬렉션에서 현재 위치의 데이터를 제거한다.       
    직전의 next() 메소드 호출이나 previous() 메소드 호출에서 리턴된 데이터가 제거된다.      

* `void set(E e)`   
    현재 위치에 데이터 e를 **덮어쓴다.**    
    직전의 next() 메소드 호출이나 previous() 메소드 호출에서 리턴된 데이터가 덮어 써진다.   
    

2) List Iterator 객체 생성      
List 인터페이스의 listIterator() 메소드를 호출하면,     
현재 컬렉션 객체를 탐색하기 위한 이터레이터 객체가 생성되어 리턴된다.       

**List 인터페이스의 메소드**
* `ListIterator listIterator()`     
    현재 리스트 객체를 탐색하기 위한 리스트 이터레이터 객체가 생성되어 리턴한다. 리턴된 리스트 이터레이터 객체의 현재 위치는, *아직 아무것도 가르키고 있지 않다.*       
    리스트 이터레이터 객체를 생성한 후, next() 메소드를 호출하면 목록에서 첫 데이터 항목을 가리킨다.        
* `ListIterator listIterator(int index)`    
    현재 리스트 객체를 탐색하기 위한 리스트 이터레이터 객체가 생성되어 리턴된다.    
    리턴된 리스트이터레이터 객체의 현재 위치는, index 위치의 데이터 항목을 가르킨다.        

**역방향 탐색**     
```java
ListIterator<Integer> iterator = list.listIterator(list.size());
while(iterator.hasPrevious()){
    Integer i = iterator.previous();
    System.out.print(i + " ");
}
```

**탐색 중 삽입**        
```java
List<Integer> iterator = list.listIterator();
while(iterator.hasNext()){
    int i = iterator.next();
    if(i % 2 == 1)
        iterator.add(i+1);
}
//또는
List<Integer> iterator = list.listIterator(list.size());
while(iterator.hasPrevious()){
    int i = iterator.previous();
    if(i % 2 == 1)
        iterator.add(i-1);
}
```