package cn.mldn.microboot.actuator;

import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.stereotype.Component;
import org.springframework.boot.actuate.info.InfoContributor;
@Component
public class ProjectInfoContributor implements InfoContributor {

	@Override
	public void contribute(Builder builder) {
		builder.withDetail("company.name", "mldn") ;
		builder.withDetail("version", "V1.0") ;
		builder.withDetail("author", "Young Lee") ;
	}

}
