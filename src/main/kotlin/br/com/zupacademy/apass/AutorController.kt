package br.com.zupacademy.apass;

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post
import org.slf4j.LoggerFactory

@Controller("/api/v1/autor")
class AutorController {

    private val logger = LoggerFactory.getLogger(this.javaClass)

    @Post
     fun cadastra(@Body request: AutorRequest): HttpResponse<*> {
        this.logger.info(request.toString());
        return HttpResponse.created(request)
    }
}
