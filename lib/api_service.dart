import 'package:http/http.dart' as http;
import 'dart:convert';

class ApiService {
  final String baseUrl = 'http://localhost:8080'; // Spring Boot URL

  Future<String> fetchHello() async {
    try {
      final response = await http.get(Uri.parse('$baseUrl/hello'));

      if (response.statusCode == 200) {
        // JSON Format auslesen
        var data = jsonDecode(response.body);
        print('Response from /hello: $data');
        return response.body;
      } else {
        throw Exception('Failed to fetch hello: ${response.statusCode}');
      }
    } catch (e) {
      print('Error: $e');
      rethrow; 
    }
  }

  
}
