# AWS CloudFormation to DOT Diagram Project

## Description
This project provides a pipeline for transforming an XMI model conforming to a specific metamodel into a DOT diagram. The DOT diagram is then rendered into a visual representation using Graphviz. The goal is to visualize AWS CloudFormation resources (e.g., EC2 instances, RDS databases, VPCs, and subnets) as a hierarchical diagram with meaningful relationships and containment zones.

## Features
- Parses XMI models that conform to the awsDiagram metamodel.
- Generates DOT files from the XMI model.
- Handles resources, edges, and hierarchical zones (e.g., VPCs containing subnets).
- Renders the DOT file into a PNG image using Graphviz.

## Requirements
### Software
- Python 3.8+
- Graphviz (installable via your package manager or from [Graphviz Downloads](https://graphviz.org/download/))

### Python Libraries
- xml.etree.ElementTree: For parsing XMI files.
- argparse: For handling command-line arguments.
- subprocess: For executing Graphviz commands.

## Files in the Project
- *awsDiagram.ecore*: The metamodel defining the structure of AWS diagrams.
- *Sample XMI File*: A sample instance file representing an AWS diagram.
- *convert_xmi_to_dot.py*: Python script to parse the XMI model, generate a DOT file, and render it as a PNG.
- *Output Files*: The DOT file and the rendered PNG.

## Installation
1. Clone this repository:
   bash
   git clone <repository_url>
   cd <repository_directory>
   

2. Install Graphviz:
   - On Ubuntu/Debian:
     bash
     sudo apt install graphviz
     
   - On macOS (with Homebrew):
     bash
     brew install graphviz
     
   - On Windows: Download and install from the [official site](https://graphviz.org/download/).

3. Ensure Python is installed and the required libraries are available. You can install them using pip:
   bash
   pip install -r requirements.txt  # Create if needed
   

## Usage
1. Prepare your XMI model conforming to the awsDiagram metamodel.
2. Run the script with the required arguments:
   bash
   python convert_xmi_to_dot.py <input_xmi_file> <output_dot_file> <output_image_file>
   

   Example:
   bash
   python convert_xmi_to_dot.py input_model.xmi output_diagram.dot output_diagram.png
   
3. View the generated PNG file in your image viewer.

## Project Structure
plaintext
.
├── awsDiagram.ecore          # Metamodel definition
├── input_model.xmi           # Example XMI input file
├── convert_xmi_to_dot.py     # Main script for transformation
├── output_diagram.dot        # Generated DOT file
├── output_diagram.png        # Rendered PNG diagram
└── README.md                 # Documentation


## Example
### Sample XMI Input
xml
<xmi:XMI xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:awsDiagram="http://www.example.org/awsDiagram">
  <awsDiagram:Diagram name="AWS Diagram" description="Example AWS CloudFormation Template"/>
  <awsDiagram:Node id="AWS::EC2::Instance" label="AWS::EC2::Instance" type="Resource" shape="box" color="orange"/>
  <awsDiagram:Node id="AWS::RDS::DBInstance" label="AWS::RDS::DBInstance" type="Resource" shape="cylinder" color="lightgreen"/>
  <awsDiagram:Zone id="vpc-123" label="VPC vpc-123">
    <awsDiagram:Zone id="subnet-abc" label="Subnet subnet-abc"/>
  </awsDiagram:Zone>
</xmi:XMI>


### Generated DOT Output
dot
digraph "AWS Diagram" {
    node [fontname="Helvetica"];
    "AWS::EC2::Instance" [label="AWS::EC2::Instance", shape="box", color="orange"];
    "AWS::RDS::DBInstance" [label="AWS::RDS::DBInstance", shape="cylinder", color="lightgreen"];

    subgraph cluster_vpc-123 {
        label="VPC vpc-123";
        "subnet-abc";
    }
}


### Rendered PNG
![Generated Diagram](output_diagram.png)

## Limitations
- Only supports the awsDiagram metamodel.
- Ensure your XMI file conforms to the metamodel structure; otherwise, parsing will fail.

## Contributing
1. Fork the repository.
2. Create a feature branch.
3. Commit your changes.
4. Submit a pull request.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
