package pl.damrob.votas.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
public class SwaggerExampleController {

    @GetMapping(value = "/reports/{reportId}")
    ResponseEntity<String> getReports(@RequestParam String reportId) {
        return ResponseEntity.ok(String.format("Fetched report with id: %s", reportId));
    }

    @PostMapping(value = "/reports")
    ResponseEntity<String> postReport(@RequestBody Report report) {
        return ResponseEntity
                .created(URI.create(report.getId()))
                .build();
    }

    @PatchMapping(value = "/reports/{reportId}")
    ResponseEntity<String> patchReport(@RequestBody Report report, @RequestParam String reportId) {
        return ResponseEntity.ok(String.format("Report with id: %s, changed to id passed in request body: %s", reportId, report.getId()));
    }

    @DeleteMapping(value = "/reports/{reportId}")
    ResponseEntity<String> deleteReport(@RequestParam String reportId) {
        return ResponseEntity.ok(String.format("Deleted report with body: %s", reportId));
    }

    @PutMapping(value = "/reports/{reportId}")
    ResponseEntity<String> deleteReport(@RequestBody Report report) {
        return ResponseEntity
                .created(URI.create(report.getId()))
                .build();
    }
}
