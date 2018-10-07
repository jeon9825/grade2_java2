# grade2_java2
 
## 아직 해결하지 못한 문제
Q. Integer 클래스가 immutable인 이유는 무엇인가?    

## 목차
[2 기본 자료형과 참조형](https://github.com/jeon9825/grade2_java2#02-기본-자료형과-참조형)    
[3 기본 자료형 클래스](https://github.com/jeon9825/grade2_java2#03-기본-자료형-클래스)      
[5 문자열 클래스](https://github.com/jeon9825/grade2_java2#05-문자열-클래스)     
[6 Java 배열 정렬 기능](https://github.com/jeon9825/grade2_java2#06-java-배열-정렬-기능)    
[7 Arrays 클래스](https://github.com/jeon9825/grade2_java2#07-arrays-클래스)
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
    ~~~
    String s1= "hello";
	System.out.println(s1.matches("..l..")); // true 출력
    ~~~     

* String replace(CharSequence s1, CharSequence s2)     
    this 문자열에서 문자열 s1을 전부 찾아서 s2로 치환한다. 그렇게 치환된 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.   

* String replaceAll(String regex, String s2)    
    this 문자열에서 regex 정규식과 일치하는 부분을 전부 찾아서 s2로 치환한다. 그렇게 치환된 새 문자열을 리턴한다. this 문자열은 수정되지 않는다.    
~~~
String s1 = "hello";
String s2 = s1.replace("ell", "ELL");
String s3 = s1.replaceAll(".l.", "안녕");
System.out.println(s2+"\n"+s3); // hELLo\nh안녕o 출력 
~~~     

* String[] split(String regex)  
    regex 정규식과 일치하는 부분을 기준으로 this 문자열을 쪼갠다. 그렇게 쪼개진 문자열 배열을 리턴한다.
    예) ``

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

~~~
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
~~~
Object s = "hello";
System.out.println(s instanceof String); // true 출력
~~~
~~~
Object s = "hello";
System.out.println(s instanceof Object); // true 출력
~~~     

2) @Override 어노테이션의 장점      
(1) 부모 클래스의 메소드를 자식 클래스에서 재정의 하려면, 메소드 이름, 파라미터 수와 타입, 리턴 타입이 부모 클래스의 메소드와 정확히 일치해야 한다. 예를 들어 equals 메소드의 파라미터 타입은 Object 이어야 하고, 리턴 타입은 boolean 이어야 한다. @Override 어노테이션을 붙여주면, 위 사항들이 정확히 일치하는지 자동으로 검사된다.    
(2) @Override 어노테이션을 보면, 부모 클래스이 메소드를 재정의한다는 것을 바로 알 수 있어서 소크 코드 읽을 때 편하다.   

3) equals 메소드 재정의     
1.      
    ~~~
    @Override
    public boolean equals(Object obj) { 
        if ((obj instanceof Person) == false) 
            return false; 
        Person p = (Person)obj; 
        return (this.name == null ? p.name == null : this.name.equals(p.name)) && this.age == p.age; 
    }
    ~~~
2.      
    ~~~
    @Override 
    public boolean equals(Object obj) { 
        if (obj instanceof Person == false) 
            return false; 
        Person p = (Person)obj; 
        return Objects.equals(this.name, p.name) && this.age == p.age; 
    }
    ~~~

4) toString 메소드 재정의   
~~~
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
~~~
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
~~~
Integer x = new Integer(3);
Integer y = new Integer(3);
System.out.println(a.equals(b)); // false 출력
~~~

2) Auto-boxing & Auto-unboxing  
* Auto-boxing   

`Object a1 = 3;`     
`Object a2 = new Integer(3);`
둘은 같은 코드   
컴파일러가 윗 코드를 아래코드로 자동으로 생성 Autoboxing    

* Auto-unboxing

~~~
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
static 메소드는 this가 아닌 다른 객체 인스턴스의 멤버 변수나 메소드는 사용할 수 있다.   

3) static constructor (생성자)  
main 메소드보다 먼저 호출된다.
~~~
public class Person { 
    static int staticVariable; 
    static { 
        staticVariable = 0;
    }
}
~~~

~~~
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
~~~~
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

~~~
StringBuilder sb1 = new StringBuilder();
sb1.append("안녕");
StringBuilder sb2 = new StringBuilder();
sb2.append("안녕");
System.out.println(sb1.equals(sb2)); // 출력값 false
~~~     
에러는 발생하지 않는다. (Object 클래스를 상속하고 있기 때문에)  
문자열을 조립해서 생성할 때만 잠깐 StringBuilder 객체를 사용하라는 의미에서 equals 메소드가 재정의되지 않았다.  

### 05-2 예제코드   
~~~~
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
~~~~
interface Comparable<T> {
    int compareTo(T obj)
}
~~~~
[Comparable 인터페이스를 구현한 클래스](https://docs.oracle.com/javase/7/docs/api/java/lang/Comparable.html)    
String 클래스, Integer 클래스도 Comparable 인터페이스를 구현했기 때문에, Arrays.sort 메소드로 정렬할 수 있다.   

2) 기본 자료형 배열과 객체 배열     

java언어에서 배열도 일종의 객체!    
객체는 heap segment 영역에 설정된다.    
    
~~~~
Integer[] b1 = new Integer[] { new Integer(10), new Integer(11), new Integer(12) }; 
Integer[] b2 = new Integer[] { 10, 11, 12 }; 
Integer[] b3 = { 10, 11, 12 };
~~~~    
서로 완전히 동일한 배열     

**Comparable 인터페이스를 구현하면, Arrays.sort 메소드를 사용하여 객체 배열을 정렬할 수 있다.**

~~~~
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
~~~~
public class PersonNameComparator implements Comparator<Person> { 
    @Override 
    public int compare(Person p1, Person p2) { 
        int r = p1.name.compareTo(p2.name); // 먼저 이름(name)을 비교한다. 
        if (r != 0) return r; // 이름이 같지 않다면, 이름 비교 결과를 리턴한다. 
        return p1.age - p2.age; // 이름이 같다면, 나이(age) 비교 결과를 리턴한다. } }
~~~~    

### 06-3 Comparator 인터페이스
~~~~
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
~~~~
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

~~~~
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
  
~~~~
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
    ~~~~
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
~~~~
Random random = new Random();
int i = random.nextInt(10);
~~~~    
Random 클래스의 int nextInt(int n) 메소드는 0~n-1 정수 중의 하나를 랜덤하게 골라서 리턴     
