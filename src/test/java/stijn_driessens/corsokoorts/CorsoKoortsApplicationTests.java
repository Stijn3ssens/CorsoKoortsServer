//package stijn_driessens.corsokoorts;
//
//import stijn_driessens.corsokoorts.entities.Corso;
//import stijn_driessens.corsokoorts.repositories.CorsoRepository;
//import stijn_driessens.corsokoorts.services.CorsoService;
//import org.junit.Before;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//
//import java.util.Optional;
//
////@RunWith(SpringRunner.class)
////@DataJpaTest
//@SpringBootTest
//class CorsoKoortsApplicationTests {
//
//	private CorsoService corsoService;
//
//	@MockBean
//	private CorsoRepository corsoRepository;
//
//	// write test cases here
//
//	@Before
//	public void setUp() {
//		corsoService = new CorsoService(corsoRepository);
//
//		Corso corso = new Corso();
//		corso.setId(1L);
//		corso.setName("corso1");
//		corso.setCorso(true);
//		corso.setAccountId(3L);
//
//		Mockito.when(corsoRepository.findById(corso.getId())).thenReturn(Optional.of(corso));
//	}
//
//	@Test
//	public void testGetById()
//	{
//		Corso result = corsoService.getById(1L);
//
//		Assertions.assertEquals(result.getName(), "corso1");
//	}
//
////	private MockMvc mockMvc;
////	@Before
////	public void setup() throws Exception {
////		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
////	}
//}
//
////@RunWith(SpringRunner.class)
////public class MockBeanAnnotationIntegrationTest {
////
////	@MockBean
////	UserRepository mockRepository;
////
////	@Autowired
////	ApplicationContext context;
////
////	@Test
////	public void givenCountMethodMocked_WhenCountInvoked_ThenMockValueReturned() {
////		Mockito.when(mockRepository.count()).thenReturn(123L);
////
////		UserRepository userRepoFromContext = context.getBean(UserRepository.class);
////		long userCount = userRepoFromContext.count();
////
////		Assert.assertEquals(123L, userCount);
////		Mockito.verify(mockRepository).count();
////	}
////}