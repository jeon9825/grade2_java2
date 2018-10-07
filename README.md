# grade2_java2
 
## 목차
[5 문자열 클래스](https://github.com/jeon9825/grade2_java2#05-문자열-클래스)     
[6 Java 배열 정렬기능](https://github.com/jeon9825/grade2_java2#06-java-%EB%B0%B0%EC%97%B4-%EC%A0%95%EB%A0%AC-%EA%B8%B0%EB%8A%A5)    
[7 Arrays 클래스](https://github.com/jeon9825/grade2_java2#07-arrays-%ED%81%B4%EB%9E%98%EC%8A%A4)
___

## 05 문자열 클래스
### 05-1 Java 문자열
1) java 문자열의 종류   
![CharSequence](https://t1.daumcdn.net/cfile/tistory/993258405BB8ED7C2C)   

**CharSequence interface**  
String, StringBuilder, StringBuffer의 부모 인터페이스   

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
