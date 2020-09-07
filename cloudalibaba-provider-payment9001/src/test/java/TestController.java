import com.aiguigu.springCloud.controller.PaymentController;
import org.junit.Test;

/**
 * @ClassName: TestController
 * @Description TODO:
 * @Author: LiZhenxiang
 * @Creat: 2020/8/14 11:09
 * @Update 2020/8/14 11:09
 * @See:
 * @Version: 1.0
 **/
public class TestController {

    @Test
    public String getP(){
        return new PaymentController().getPayment(3);
    }
}
