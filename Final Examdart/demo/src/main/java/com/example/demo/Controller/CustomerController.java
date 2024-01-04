package com.example.demo.Controller;

public class CustomerController {
    @RestController
    @RequestMapping("/api/customers")
    public class CustomerController {

        @Autowired
        private CustomerService customerService;

        @PostMapping("/add")
        public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
            Customer savedCustomer = customerService.saveCustomer(customer);
            return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);

        }
        @GetMapping("/all")
        public ResponseEntity<List<Customer>> getAllCustomers() {
            return new ResponseEntity<>(customerService.getAllCustomers(), HttpStatus.OK);
        }

    }
}
