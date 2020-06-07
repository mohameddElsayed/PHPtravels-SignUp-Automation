//package http_Interceptor;
//
//public @interface Injectable {
//	
//}
//	@Injectable()
//	
//	export class AuthInterceptor implements HttpInterceptor {
//
//	    void constructor(auth: AuthService) #
//	    
//	    @Injectable()
//	    export class AuthInterceptor implements HttpInterceptor {
//	      private auth: AuthService;
//
//	      constructor(inj: Injector) {
//	        this.auth = inj.get(AuthService);
//	      }
//
//	      intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
//	        // Ignore if login or refresh request
//	        if (req.url.includes('login')) {
//	          return next.handle(req);
//	        }
//
//	        console.log('Intercepting request');
//	        return this.auth.getToken().map(token => {
//	          const authHeader = 'Bearer ' + token;
//	          const authReq = req.clone({setHeaders: {Authorization: authHeader}});
//	          return authReq;
//	        }).concatMap(newReq => next.handle(newReq));
//	      }
//	    }
//}
