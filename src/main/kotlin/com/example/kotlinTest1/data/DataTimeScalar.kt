import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.databind.SerializationFeature
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import graphql.scalars.ExtendedScalars
import graphql.schema.GraphQLScalarType
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

//import com.netflix.graphql.dgs.DgsScalar
//import graphql.language.StringValue
//import graphql.scalars.ExtendedScalars
//import graphql.schema.*
//import org.springframework.context.annotation.Bean
//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter
//
//
//@DgsScalar(name = "DateTime")
//class DateTimeScalar : Coercing<LocalDateTime, String> {
//    @Throws(CoercingSerializeException::class)
//    override fun serialize(dataFetcherResult: Any): String {
//        return if (dataFetcherResult is LocalDateTime) {
//            dataFetcherResult.format(DateTimeFormatter.ISO_DATE_TIME)
//        } else {
//            throw CoercingSerializeException("Not a valid DateTime")
//        }
//    }
//
//    @Throws(CoercingParseValueException::class)
//    override fun parseValue(input: Any): LocalDateTime {
//        return LocalDateTime.parse(input.toString(), DateTimeFormatter.ISO_DATE_TIME)
//    }
//
//    @Throws(CoercingParseLiteralException::class)
//    override fun parseLiteral(input: Any): LocalDateTime {
//        if (input is StringValue) {
//            return LocalDateTime.parse((input as StringValue).getValue(), DateTimeFormatter.ISO_DATE_TIME)
//        }
//        throw CoercingParseLiteralException("Value is not a valid ISO date time")
//    }
//}
//
//
@Component
class scalars() {


    @Bean
    fun objectMapper(): ObjectMapper? {
        return ObjectMapper().registerModule(JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
    }

//    @Bean
//    fun schemaParserOptions(): SchemaParserOptions? {
//        return SchemaParserOptions.newOptions()
//            .objectMapperProvider(PerFieldObjectMapperProvider { fieldDefinition: FieldDefinition? -> objectMapper() }).build()
//    }

    @Bean
    fun date(): GraphQLScalarType? {
        return ExtendedScalars.Date
    }

    @Bean
    fun datetime(): GraphQLScalarType? {
        return ExtendedScalars.DateTime
    }
}