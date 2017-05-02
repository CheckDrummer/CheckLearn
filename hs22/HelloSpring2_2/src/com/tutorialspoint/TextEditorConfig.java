package com.tutorialspoint;
import org.springframework.context.annotation.*;

@Configuration
public class TextEditorConfig {
   @Bean 
   public TextEditor textEditor(){
      return new TextEditor( spellChecker() );
   }

   @Bean //(initMethod = "init", destroyMethod = "cleanup" )
   // @Scope("prototype")
   public SpellChecker spellChecker(){
      return new SpellChecker( );
   }
}