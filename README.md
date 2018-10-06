# grade2_java2
## 07 Arrays 클래스
### 07-02 유틸러티 클래스 헬퍼클래스

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

### 07-03 Arrays 클래스
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
