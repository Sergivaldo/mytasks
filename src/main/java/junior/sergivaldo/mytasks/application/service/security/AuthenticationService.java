package junior.sergivaldo.mytasks.application.service.security;

public interface AuthenticationService<C, A> {

    A authenticate(C credentials) throws AuthenticationException;

}
