package com.example.side.model.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data // Lombok 어노테이션: getter, setter, toString, equals, hashCode 메서드를 자동 생성합니다.
@Entity // 데이터베이스 테이블과 매핑되는 엔티티 클래스임을 나타냅니다.
@AllArgsConstructor // 모든 필드를 인자로 받는 생성자를 자동 생성합니다.
@NoArgsConstructor // 파라미터가 없는 생성자를 자동 생성합니다.
@Builder // 빌더 패턴을 구현합니다.
@Accessors(chain = true) // setter 메서드를 체인 형태로 사용할 수 있도록 합니다.
@ToString(exclude = {}) // 해당 필드를 toString 메서드에서 제외합니다.
@EntityListeners(AuditingEntityListener.class) // 엔티티의 변경 사항을 자동으로 감지합니다.

public class Community {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
