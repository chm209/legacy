package sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	// @Setter(onMethod_ = @Autowired)
	@Setter(onMethod = @__({ @Autowired }))
	private Chef chef;
	
	// 12.28 PM 22:41
	// onMethod_にエラーがある時はprojectのmaven updateをさせば、解決出来る。
	// ただし、そのまえにはっきりLombok.jarをstsに追加したか、しなかったか確認が必要です。
}
