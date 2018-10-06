# grade2_java2
## 07 Arrays 클래스
### 07-02 유틸러티 클래스 헬퍼클래스

* 1) 자식클래스  
어떤 클래스에 메소드를 추가로 구현하려고 할 때,  
만약 그 클래스를 수정할 수 없다면, 자식클래스를 만들어서 메소드를 추가로 구현하면 된다.  
  
아래의 코드는 String 클래스를 상속받은 MyString이라는 자식클래스를 만들었다.   
`
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
`
이렇게 만들 경우 단점은 String클래스에서 가능했던 문법을 사용하지 못할 수도 있다.  
예) MyString s = "hello";  
  
* 2) 유틸러티 클래스  
 `
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
 `
StringUtils 클래스의 모든 메소드는 static메소드!  
StringUtils 클래스의 메소드는 * StringUtils 클래스의 멤버 변수를 사용할 일이 없기 때문이다.*  
다음과 같이 사용한다.  
  
`
String s = "hello";
if (StringUtils.isNullOrBlank(s) == false) 
    errorMessage = "내용을 입력하세요";
`

### 07-03 Arrays 클래스
1) 