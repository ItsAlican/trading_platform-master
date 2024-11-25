import 'package:flutter/material.dart';
import '../api_service.dart';

class TestApiScreen extends StatelessWidget {
  const TestApiScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('API Test'),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            ElevatedButton(
              onPressed: () async {
                ApiService apiService = ApiService();

                try {
                  String message = await apiService.fetchHello(); // API aufrufen
                  ScaffoldMessenger.of(context).showSnackBar(
                    SnackBar(content: Text('API Test erfolgreich!: $message' )),
                  );
                } catch (e) {
                  ScaffoldMessenger.of(context).showSnackBar(
                    const SnackBar(content: Text('Fehler beim API Test')),
                  );
                }
              },
              child: const Text('Test API'),
            ),
          ],
        ),
      ),
    );
  }
}
