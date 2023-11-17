package org.example.entities;

import lombok.Data;
import lombok.Setter;

@Data
public class Note {
    @Setter
    private static Long id;
    @Setter
    private static String title;
    @Setter
    private static String content;


}
