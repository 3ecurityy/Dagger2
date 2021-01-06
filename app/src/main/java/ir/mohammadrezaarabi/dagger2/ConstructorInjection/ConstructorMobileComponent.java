package ir.mohammadrezaarabi.dagger2.ConstructorInjection;

import dagger.Component;
import ir.mohammadrezaarabi.dagger2.ConstructorInjection.Mobile.Mobile;

/* Annonation Component یک پل ارتباطی می باشد */
@Component
public interface ConstructorMobileComponent {
    Mobile buildMobile();
}
