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
        .title("Hello World")
        .body("I'm happy you could make it here!");
    return ResponseEntity.ok(helloWorld);
  }
}
