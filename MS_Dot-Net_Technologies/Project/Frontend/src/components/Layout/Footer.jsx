import { Container } from 'react-bootstrap';

export default function AppFooter() {
    return (
        <footer style={{
            background: '#f8f9fa',
            borderTop: '1px solid #dee2e6',
            padding: '1rem 0',
            boxShadow: '0 -1px 4px rgba(0,0,0,0.05)',
            position: 'sticky',
            top: '100vh'
        }}>
            <Container className="text-center">
                <div style={{ marginBottom: '0.3rem' }}>
                    <a href="/about" style={footerLinkStyle}>About</a> |{' '}
                    <a href="/contact" style={footerLinkStyle}>Contact</a> |{' '}
                    <a href="/feedback" style={footerLinkStyle}>Feedback</a>
                </div>
                <span style={{ color: '#6c757d', fontSize: '0.95rem' }}>
                    &copy; {new Date().getFullYear()} Courier Tracking System. All rights reserved.
                </span>
            </Container>

            <style>{`
                footer.dark-mode {
                    background: #212529;
                    border-top: 1px solid #343a40;
                }
                footer.dark-mode span, footer.dark-mode a {
                    color: #ff7dbf !important;
                }
                footer a {
                    color: #f54291;
                    text-decoration: none;
                    font-weight: 500;
                }
                footer a:hover {
                    color: #d63384;
                    text-decoration: underline;
                }
                footer.dark-mode a:hover {
                    color: #ff99cc !important;
                }
            `}</style>
        </footer>
    );
}

const footerLinkStyle = {
    color: '#f54291',
    textDecoration: 'none',
    fontSize: '0.95rem',
    fontWeight: 500
};
