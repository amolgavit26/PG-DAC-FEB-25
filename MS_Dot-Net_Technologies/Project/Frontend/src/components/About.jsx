import React, { useEffect } from 'react';
import { Container, Row, Col, Card, Image, Button } from 'react-bootstrap';
import AOS from 'aos';
import 'aos/dist/aos.css';
import CountUp from 'react-countup';
import { PackageCheck, Truck, Headset } from 'lucide-react';

export default function About() {
  useEffect(() => {
    AOS.init({ duration: 1000, once: true });
  }, []);

  return (
    <div style={{ background: '#f8fafc', padding: '60px 0' }}>
      <Container>
        <h2 className="fw-bold text-center mb-2" style={{ fontSize: '2.3rem', color: '#212529' }}>
          About Us
        </h2>
        <p className="text-center mb-5 text-muted">
          Your trusted partner in courier and logistics services
        </p>

        {/* Our Story and Mission/Vision */}
        <Row className="align-items-start mb-5 gx-4 gy-4">
          <Col md={7} data-aos="fade-up">
            <h4 className="fw-semibold mb-3">Our Story</h4>
            <p className="text-muted" style={{ lineHeight: '1.8' }}>
              Founded with a vision to revolutionize the courier industry, our Courier Management System
              has been serving customers with dedication and excellence. We understand the importance of
              timely and secure deliveries in today's fast-paced world.
              <br /><br />
              Our team of experienced professionals works tirelessly to ensure that every package reaches
              its destination safely and on time. We leverage cutting-edge technology to provide real-time
              tracking and seamless communication throughout the delivery process.
            </p>
          </Col>
          <Col md={5} data-aos="fade-up">
            <Card className="shadow-sm border-0 rounded-4 p-4">
              <h5 className="fw-bold mb-3">Our Mission</h5>
              <p className="text-muted">
                To provide reliable, efficient, and secure courier services while maintaining the highest
                standards of customer satisfaction.
              </p>
              <h5 className="fw-bold mt-4 mb-3">Our Vision</h5>
              <p className="text-muted">
                To be the leading courier service provider, known for innovation, reliability, and
                exceptional customer service.
              </p>
            </Card>
          </Col>
        </Row>

        {/* Stats Section */}
        <Row className="text-center g-4 mb-5">
          <Col md={4} data-aos="fade-up">
            <Card className="shadow-sm border-0 rounded-4 p-4 hover-card">
              <PackageCheck color="#e91e63" size={36} className="mb-2 icon-hover" />
              <h3 className="fw-bold" style={{ color: '#e91e63' }}>
                <CountUp end={5} duration={2} />+
              </h3>
              <p className="mb-1 fw-semibold">Years of Experience</p>
              <p className="text-muted small">Serving customers with dedication and reliability</p>
            </Card>
          </Col>
          <Col md={4} data-aos="fade-up">
            <Card className="shadow-sm border-0 rounded-4 p-4 hover-card">
              <Truck color="#e91e63" size={36} className="mb-2 icon-hover" />
              <h3 className="fw-bold" style={{ color: '#e91e63' }}>
                <CountUp end={10000} duration={2.5} separator="," />+
              </h3>
              <p className="mb-1 fw-semibold">Deliveries Completed</p>
              <p className="text-muted small">Successfully delivered packages across the region</p>
            </Card>
          </Col>
          <Col md={4} data-aos="fade-up">
            <Card className="shadow-sm border-0 rounded-4 p-4 hover-card">
              <Headset color="#e91e63" size={36} className="mb-2 icon-hover" />
              <h3 className="fw-bold" style={{ color: '#e91e63' }}>24/7</h3>
              <p className="mb-1 fw-semibold">Customer Support</p>
              <p className="text-muted small">Round-the-clock assistance for all your needs</p>
            </Card>
          </Col>
        </Row>

        {/* Team Section */}
        <h4 className="fw-bold text-center mb-4" style={{ color: '#212529' }}>Meet Our Team</h4>
        <Row className="g-4 justify-content-center">
          {[
            {
              img: 'src/assets/PratikshaShilimkar.jpg',
              name: 'Pratiksha Shilimkar',
              role: 'Frontend',
              desc: 'Designed intuitive user interfaces for easy tracking, booking, and monitoring of parcels.',
              linkedin: 'http://linkedin.com/in/pratiksha-shilimkar-9249b7262',
              github: 'https://github.com/PratikshaCdac'
            },
            {
              img: 'src/assets/AmolGavit.png',
              name: 'Amol Nethu Gavit',
              role: 'Backend',
              desc: 'Developed robust backend APIs for order management, authentication, and dashboards.',
              linkedin: 'https://www.linkedin.com/in/amolgavit26/',
              github: 'https://github.com/amolgavit26'
            },
            {
              img: 'src/assets/HarshadaTapase.jpg',
              name: 'Harshada Tapase',
              role: 'Frontend',
              desc: 'Collaborated to translate complex requirements into clean UI components.',
              linkedin: 'http://www.linkedin.com/in/harshada-tapase-124982267',
              github: 'https://github.com/9595111395/Harshada'
            }
          ].map((member, idx) => (
            <Col md={4} sm={6} data-aos="fade-up" key={idx}>
              <Card
                className="text-center shadow-sm border-0 rounded-4 p-4 hover-card"
                style={{
                  minHeight: '500px',
                  display: 'flex',
                  flexDirection: 'column',
                  justifyContent: 'space-between'
                }}
              >
                <div style={{ width: '100%', height: '260px', display: 'flex', alignItems: 'center', justifyContent: 'center', marginBottom: '15px' }}>
                  <Image
                    src={member.img}
                    style={{ maxHeight: '100%', width: 'auto', objectFit: 'contain' }}
                    rounded
                  />
                </div>
                <div>
                  <h5 className="fw-bold mb-1">{member.name}</h5>
                  <small className="text-muted mb-2 d-block">({member.role})</small>
                  <p className="text-muted small">{member.desc}</p>
                  <div className="d-flex justify-content-center gap-2">
                    <Button variant="outline-primary" size="sm" href={member.linkedin} target="_blank">
                      LinkedIn
                    </Button>
                    <Button variant="outline-dark" size="sm" href={member.github} target="_blank">
                      GitHub
                    </Button>
                  </div>
                </div>
              </Card>
            </Col>
          ))}
        </Row>
      </Container>

      {/* Scoped Styles */}
      <style>{`
        .hover-card:hover {
          transform: translateY(-5px);
          box-shadow: 0 6px 16px rgba(0,0,0,0.2);
          transition: all 0.3s;
        }
        .icon-hover:hover {
          transform: scale(1.2);
          transition: transform 0.3s;
        }
      `}</style>
    </div>
  );
}
