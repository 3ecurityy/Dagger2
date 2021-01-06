package ir.mohammadrezaarabi.dagger2.FieldInjection;

import dagger.Component;
import ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile.Mobile;

/* Annonation Component یک پل ارتباطی می باشد */
@Component
public interface FieldMobileComponent {
    void injectField(FieldInjectionActivity fieldInjectionActivity);
}
