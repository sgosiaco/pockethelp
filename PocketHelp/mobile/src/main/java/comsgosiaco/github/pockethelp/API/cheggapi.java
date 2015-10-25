package comsgosiaco.github.pockethelp.API;
import java.util.List;

import comsgosiaco.github.pockethelp.model.cheggmodel;
import retrofit.Call;
import retrofit.http.*;

/**
 * Created by seangosiaco on 10/24/15.
 */
public interface cheggapi {
    @GET("/hachacking-edu/schools/?q=name:{school}")
    Call<List<cheggmodel.Result>> listSchools(@Path("school") String school);

}
