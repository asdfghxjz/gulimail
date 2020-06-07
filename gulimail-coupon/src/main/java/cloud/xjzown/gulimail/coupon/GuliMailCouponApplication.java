package cloud.xjzown.gulimail.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = "cloud.xjzown.gulimail.coupon")
@EnableDiscoveryClient
public class GuliMailCouponApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuliMailCouponApplication.class,args);
    }


}
