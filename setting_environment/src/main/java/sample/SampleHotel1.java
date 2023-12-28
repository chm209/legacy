package sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class SampleHotel1 {
	@NonNull
	private Chef chef;
	// @RequiredArgsConstructorは＠NonNullが付けてあるフィールドのみ初期化を行うコンストラクターを生成する
}

// <Lombok有>
//@Component
//@ToString
//@Getter
//@AllArgsConstructor
//public class SampleHotel1 {
//	private Chef chef;
//}

// ＜Lombok無＞
//@Component
//@ToString
//@Getter
//public class SampleHotel1 {
//	private Chef chef;
//	
//	public SampleHotel1(Chef chef) {
//		this.chef = chef;
//	}
//}

// 2023-12-28 23:26
// 단일 생성자의 묵시적 자동 주입 학습
// 스프링의 의존성 주입은 크게
// 	  1) 생성자 주입
//   2) Setter 주입
// 을 사용한다.
// Setter 주입의 경우 restaurant class 같은 setXXX 와 같은 메서드를 작성하고 (혹은 Lombok을 이용)
// @Autowired 어노테이션을 통해 객체를 주입한다.
// 생성자 주입은 생성자를 통해 처리한다.
// 생성자 주입의 경우 객체 생성 시 의존성 주입이 필요하므로 좀 더 엄격하게 의존성 주입을 체크하는 장점이 있다.

// Springの依存性注入の学習
// 1）コンストラクターベースの依存性注入
//   -> コンストラクターベースの注入はコンストラクターを通じて処理する
//        コンストラクターベースの注入の場合はオブジェクトを生成する時、依存性注入が必要なので
//        もっと厳しく依存性注入をチェックする頂点がある
// 2) setter ベースの依存性注入
//   -> setter 注入の場合は restaurant classのようなsetXXXと同じようなメソッドを作成し (あるいはLombokを利用)
//        そのあと @Autowired annotationを通じてオブジェクトを注入する。