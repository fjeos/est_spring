package org.example.basic.day5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    private long id;
    private String title;
    private String content;
    private LocalDateTime createAt;
}
