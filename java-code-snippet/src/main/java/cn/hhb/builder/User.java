package cn.hhb.builder;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Locale;

@Data
@Builder
@RequiredArgsConstructor
@Singular
public class User {
    @SneakyThrows
    public void  test(@NonNull String name){
        var x = new HashMap<String,Object>();
        var y = "123124";
    }
}
