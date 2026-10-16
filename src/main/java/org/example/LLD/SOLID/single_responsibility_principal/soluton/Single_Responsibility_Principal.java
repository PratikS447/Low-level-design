import org.example.LLD.SOLID.single_responsibility_principal.soluton.Invoice;
import org.example.LLD.SOLID.single_responsibility_principal.soluton.InvoicePrinter;
import org.example.LLD.SOLID.single_responsibility_principal.soluton.InvoiceRepo;

void main() {
    Invoice invoice = new Invoice(2000);
    InvoicePrinter print = new InvoicePrinter();
    print.print(invoice);
    InvoiceRepo repo = new InvoiceRepo();
    repo.save(invoice);
}
