package oop5;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Person {
	
	//필드			 			// 기본값
	@NonNull String name;		// null
	@NonNull Integer age;		// --> int를 레퍼타입으로 변경 
	boolean gender;				// false
	Double height;				// --> double을 참조타입으로 변경
	Double weight;				// 
	
	//생성자
//	Person(String name, int age) {
//		this(name, age, false, .0, .0);
//	} // constructor # 3 --> 이름,나이 말고는 몰라
	
//	Person(String name, int age, boolean gender) {
//		this(name, age, gender, .0, .0);
//	} // constructor # 2 --> 이름,나이,성별 말고는 몰라

//	Person(String name, int age, boolean gender, double height, double weight) {
//		this.name = name;
//		this.age = age;
//		this.gender = gender;
//		this.height = height;
//		this.weight = weight;
//	} // constructor # 1
	

} // end class
