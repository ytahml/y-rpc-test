package top.ytazwc.test.entity;

import lombok.*;

/**
 * @author 花木凋零成兰
 * @title User
 * @date 2025-03-24 19:36
 * @package top.ytazwc.test.entity
 * @description
 */
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;

    private Integer age;

}
