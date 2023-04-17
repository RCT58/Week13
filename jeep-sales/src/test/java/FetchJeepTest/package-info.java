@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
@Sql(scripts = {
    "classpath:flyway/migrations/V1.0__Jeep_Schema.sql",
    "classpath:flyway/migrations/V1.1__Jeep_Data.sql"}, 
    config = @SqlConfig(encoding = "utf-8"))
class FetchJeepTest {

  @Autowired
  private TestRestTemplate restTemplate;
  
  @LocalServerPort
  private int serverPort;
  
  void testThatJeepsAreReturnedWhenAValidModelAndTrimAreSupplied() {
    // test code here
  }
  
}
