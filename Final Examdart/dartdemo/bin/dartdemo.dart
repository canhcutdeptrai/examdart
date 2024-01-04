import 'package:dartdemo/dartdemo.dart' as dartdemo;

import 'dart:convert';

void main() async {
  var url = Uri.parse('http://localhost:8080/api/customers/all');
  var response = await http.get(url);

  if (response.statusCode == 200) {
    List<dynamic> customers = jsonDecode(response.body);
    for (var customer in customers) {
      print("Customer: ${customer['fullName']} - ${customer['address']}");
    }
  } else {
    print('Request failed with status: ${response.statusCode}.');
  }
}

