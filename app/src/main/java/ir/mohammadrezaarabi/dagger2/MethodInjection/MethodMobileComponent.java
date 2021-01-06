package ir.mohammadrezaarabi.dagger2.MethodInjection;

import dagger.Component;

/* Annonation Component یک پل ارتباطی می باشد */
@Component
public interface MethodMobileComponent {
    void injectField(MethodInjectionActivity fieldInjectionActivity);
}
