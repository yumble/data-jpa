package study.datajpa.repository;

import org.springframework.beans.factory.annotation.Value;

public interface UsernameOnly {

    //value는 open projections 사용
    @Value("#{target.username + ' ' + target.age + ' ' + target.team.name}")
    String getUsername();
}
