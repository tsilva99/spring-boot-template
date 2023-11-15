package dev.silvasolutions.springboottemplate.api;

import dev.silvasolutions.springboottemplate.model.HelloWorld;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @author tsilva
 * @since NEXT_RELEASE_VERSION
 */
@Component
public class TestApiDelegateImpl implements TestApiDelegate {


  @Override
  public ResponseEntity<HelloWorld> getHelloWorld() {
    var helloWorld = new HelloWorld()
        .title("Hey Jill")
        .body("I hope you have a lovely day at work, and I can't wait to see you later!");
    return ResponseEntity.ok(helloWorld);
  }
}
